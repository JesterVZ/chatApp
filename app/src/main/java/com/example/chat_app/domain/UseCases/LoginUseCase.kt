package com.example.chat_app.domain.UseCases

import com.example.chat_app.domain.Repository.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: LoginRepository
) {

}