package com.example.chat_app.data.dto

import java.math.BigInteger

data class User (
    val id: String,
    val login: String,
    val email: String,
    val status: String,
    val phone: BigInteger,
    val country: String,
    val city: String,
    val nickname: String,
)
