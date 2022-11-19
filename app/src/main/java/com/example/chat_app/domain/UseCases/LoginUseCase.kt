package com.example.chat_app.domain.UseCases

import com.example.chat_app.common.Resource
import com.example.chat_app.domain.Repository.LoginRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: LoginRepository
) {
    suspend operator fun invoke(login: String, password: String): Flow<Resource<String>> = flow {
        try {
            emit(Resource.Loading())
            val token = repository.Login(login, password)
            emit(Resource.Success(token))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage?: "Some error"))
        }catch (e: IOException){
            emit(Resource.Error("Connection error"))
        }
    }
}