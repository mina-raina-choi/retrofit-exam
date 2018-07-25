package com.example.cmina.retrofit_exam;

import com.example.cmina.retrofit_exam.pojo.MultipleResource;
import com.example.cmina.retrofit_exam.pojo.User;
import com.example.cmina.retrofit_exam.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

interface APIInterface {

//    이 pojo class들은 메소드의 리턴타입으로 쓰임.

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

//    @Body – Sends Java objects as request body.
    @POST("/api/users")
    Call<User> createUser(@Body User user);

//    @Query – We can simply add a method parameter with @Query()
    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

//    @Field – send data as form-urlencoded. This requires a @FormUrlEncoded annotation attached with the method.
//    The @Field parameter works only with a POST
    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}
