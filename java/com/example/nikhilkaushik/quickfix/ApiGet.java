package com.example.nikhilkaushik.quickfix;

/**
 * Created by Nikhil Kaushik on 2/6/2017.
 */

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import static com.example.nikhilkaushik.quickfix.GlobalVariables.url;

public interface ApiGet {

    String BASE_URL = url;

    @GET("/response.php")
    Call<Example> getRequest(@Query("email") String emailid);

    class Factory {
        public static ApiGet service;

        public static ApiGet getInstance() {
            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
                service = retrofit.create(ApiGet.class);
            }
            return service;
        }
    }

}
