package com.example.chat_app.data.Remote

import com.example.chat_app.data.dto.LogData
import retrofit2.http.Body
import retrofit2.http.POST

interface LogApi {
    @POST("/api/log") //реализовать на бэкенде
    suspend fun SendLog(@Body logData: LogData)
}