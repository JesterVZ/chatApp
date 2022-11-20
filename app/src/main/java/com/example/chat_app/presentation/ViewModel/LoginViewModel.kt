package com.example.chat_app.presentation.ViewModel

import androidx.lifecycle.ViewModel
import com.example.chat_app.domain.UseCases.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

}