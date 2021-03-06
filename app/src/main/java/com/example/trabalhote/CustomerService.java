package com.example.trabalhote;

import java.util.List;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CustomerService {
//    @Body
//    RequestBody body  = RequestBody.create(MediaType.parse("application/json"), obj.toString());

    @POST("customers")
    Call<Customer> create(@Body Customer customer);

    @GET("customers")
    Call<List<Customer>> listAll();

    @DELETE("customers/{id}")
    Call<Void> delete(@Path("id") Integer id);

    @PUT("customers/{id}")
    Call<Void> update(@Path("id") Integer id, @Body Customer customer);

}
