package com.example.downloadnotification;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonApi {

    @GET("db")
    Call<ResponseBody> downloadJson();
}
