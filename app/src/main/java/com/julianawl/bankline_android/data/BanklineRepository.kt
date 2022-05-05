package com.julianawl.bankline_android.data

import android.util.Log
import androidx.lifecycle.liveData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception

object BanklineRepository {

    private val restApi = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:8080/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BanklineAPI::class.java)

    fun findBankStatement(accountId: Int) = liveData {
        emit(State.Wait)
        try {
            emit(State.Success(data = restApi.findBankStatement(accountId)))
        } catch (e: Exception) {
            Log.e(javaClass.simpleName, e.message, e)
            emit(State.Error(message = e.message))
        }
    }
}