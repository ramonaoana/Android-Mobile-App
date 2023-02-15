package com.example.florence.retrofit_client;

import com.example.florence.classes.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WebAPI {
    @GET("Users")
    Call<List<User>> getUsers();

    @GET("Users/byEmailAndPass")
    Call<User> getUserByPasswordAndEmail(@Query("email") String email, @Query("password") String password);

    @GET("Users/byEmail")
    Call<User> getUserByEmail(@Query("email") String email);

    @Headers("Content-Type: application/json")
    @POST("Users")
    Call<User> postUser(@Body User user);

    @Headers("Content-Type: application/json")
    @PUT("Users/{userId}")
    Call<User> putUser(@Path("userId") int userId, @Body User user);

    @DELETE("Users/{userId}")
    Call<User> deleteUser(@Path("userId") int userId);

}
