package com.example.chat_app.domain.Data
import com.example.chat_app.domain.Enums.Result

/**
 * Результат взаимодействия с внешним сервисом
 */
data class OperationResult<T>(
    val operationResult: Result,
    val resultObject: T? = null,
    val operationInfo: String? = null
)