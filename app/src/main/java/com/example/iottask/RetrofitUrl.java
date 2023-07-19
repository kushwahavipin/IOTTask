package com.example.iottask;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUrl {
    public static RetrofitUrl instance;
    String BaseUrl="http://api.bharathaila.com/api/";
    ApiInterface apiInterface;

    public RetrofitUrl(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create()).build();
        apiInterface=retrofit.create(ApiInterface.class);

    }

    public static RetrofitUrl getInstance(){
        if (instance==null){
            instance=new RetrofitUrl();
        }
        return instance;
    }
}
