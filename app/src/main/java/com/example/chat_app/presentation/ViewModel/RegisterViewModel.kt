package com.example.chat_app.presentation.ViewModel

import androidx.lifecycle.ViewModel
import com.example.chat_app.domain.UseCases.RegisterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private  val registerUseCase: RegisterUseCase
) : ViewModel() {

}