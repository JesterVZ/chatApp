package com.example.chat_app.presentation.Activity

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.chat_app.R
import com.example.chat_app.common.BaseActivity
import com.example.chat_app.data.dto.LogData
import com.example.chat_app.databinding.ActivityLoginBinding
import com.example.chat_app.databinding.ActivityMainBinding
import com.example.chat_app.presentation.ViewModel.LoginViewModel
import com.example.chat_app.presentation.fragment.LoginFragment
import dagger.hilt.android.AndroidEntryPoint
import java.time.LocalDateTime
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : BaseActivity() {
    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()
        //sendLog(LogData(LocalDateTime.now(), "Login screen start"))
    }
}