package com.example.iottask;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iottask.Database.ProductEntity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.userHolder> {
    List<ProductEntity> allUserList;
    Activity activity;

    public UserAdapter(Activity activity, List<ProductEntity> allUserList) {
        this.activity = activity;
        this.allUserList = allUserList;
    }

    @NonNull
    @Override
    public UserAdapter.userHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,parent,false);
        return new UserAdapter.userHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.userHolder holder, int position) {
        ProductEntity model = allUserList.get(position);
        holder.name.setText(model.name);
        holder.price.setText(model.price);
        Picasso.get()
                .load(model.image)
                .resize(250, 250)
                .centerCrop()
                .into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return allUserList.size();

    }

    public class userHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView id,name,unit,unitParams,price,specialPrice,rating,
                desc,title,offer,offerType,
                disc,manufacturer,categoryname,categoryId,trending,discountProduct,stock,gst,gstRate,status,createdat;
        public userHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.productImage);
            id=itemView.findViewById(R.id.id);
            name=itemView.findViewById(R.id.name);
            unit=itemView.findViewById(R.id.unit);
            unitParams=itemView.findViewById(R.id.unitParams);
            price=itemView.findViewById(R.id.price);
            specialPrice=itemView.findViewById(R.id.specialPrice);
            rating=itemView.findViewById(R.id.rating);
        }
    }
}
