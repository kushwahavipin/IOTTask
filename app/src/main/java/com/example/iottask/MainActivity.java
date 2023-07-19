package com.example.iottask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.iottask.Database.ProductEntity;
import com.example.iottask.Database.RoomDB;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        ArrayList<ModelClass> productModel = new ArrayList<>();


        RoomDB roomDB=RoomDB.getDB(this);




        RetrofitUrl.getInstance().apiInterface.getData().enqueue(new Callback<ModelClass>() {
            @Override
            public void onResponse(Call<ModelClass> call, Response<ModelClass> response) {
                if (response.body().getStatus()==200){
                    if (response.body().getProductList().size()!=0){
                        for (int i=0; i<response.body().getProductList().size();i++){
                           // productModel.add(new ModelClass(response.body().getProductList()));
                            roomDB.productDao().insertAddress(new ProductEntity(response.body().getProductList().get(i).getName(),
                                    response.body().getProductList().get(i).getSpecialPrice().toString(),
                                    response.body().getProductList().get(i).getCategoryName(),
                                    "http://api.bharathaila.com/api/images/"+response.body().getProductList().get(i).getProductImage()));
                        }

                    }else {
                        Toast.makeText(MainActivity.this, "No data found", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ModelClass> call, Throwable t) {
            }
        });

        List<ProductEntity> entity=roomDB.productDao().getAll();
        if (roomDB.productDao().getAll().size()!=0){
            GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);
            UserAdapter adapter = new UserAdapter(MainActivity.this,entity);
            recyclerView.setAdapter(adapter);
        }

    }
}