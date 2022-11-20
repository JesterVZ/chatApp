package com.example.chat_app.common

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.chat_app.data.dto.LogData
import com.example.chat_app.domain.UseCases.SendLogDataUseCase
import javax.inject.Inject

class BaseViewModel @Inject constructor(
    private val sendLogDataUseCase: SendLogDataUseCase
) : ViewModel() {
    suspend fun sendLogData(logData: LogData){
        sendLogDataUseCase(logData)
    }
}