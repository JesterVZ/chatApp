package com.example.chat_app.domain.Repository

interface RegisterRepository {
    suspend fun Register(login: String, nickname: String, email: String, password: String, phone: String, country: String, city: String)
}