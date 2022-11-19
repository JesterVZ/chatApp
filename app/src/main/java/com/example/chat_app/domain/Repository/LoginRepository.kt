package com.example.chat_app.domain.Repository

import com.example.chat_app.data.dto.User

interface LoginRepository {
    suspend fun Login(login: String, password :String): String
    suspend fun Auth(token: String): User
}