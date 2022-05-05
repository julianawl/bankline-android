package com.julianawl.bankline_android.data

import com.julianawl.bankline_android.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineAPI {

    @GET("movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accountId: Int): List<Movimentacao>
}