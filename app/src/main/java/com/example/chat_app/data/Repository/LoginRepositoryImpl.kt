package com.example.chat_app.data.Repository

import com.example.chat_app.data.Remote.LoginApi
import com.example.chat_app.data.dto.User
import com.example.chat_app.domain.Repository.LoginRepository
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val api: LoginApi
) : LoginRepository {
    override suspend fun Login(login: String, password: String): String {
        return api.Login(login, password)
    }

    override suspend fun Auth(token: String): User {
        return api.Auth(token)
    }

}