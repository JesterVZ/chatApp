package com.example.chat_app.data.Remote

import com.example.chat_app.data.dto.User
import retrofit2.Call
import retrofit2.http.*


interface LoginApi {
    @POST("/api/login")
    suspend fun Login(@Body login: String, password: String) : String

    @POST("/api/auth")
    suspend fun Auth(@Header("Authorization") authorization: String): User
}