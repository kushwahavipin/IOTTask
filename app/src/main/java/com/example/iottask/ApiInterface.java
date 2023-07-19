package com.example.iottask;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("getApiProducts/")
    Call<ModelClass> getData();
}
