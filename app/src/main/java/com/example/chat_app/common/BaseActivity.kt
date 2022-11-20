package com.example.chat_app.common

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.chat_app.data.dto.LogData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var baseViewModel: BaseViewModel

    protected fun sendLog(logData: LogData){
        lifecycleScope.launch {
            baseViewModel.sendLogData(logData)
        }
    }
}