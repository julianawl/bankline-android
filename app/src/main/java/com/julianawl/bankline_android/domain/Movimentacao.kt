package com.julianawl.bankline_android.domain

import com.google.gson.annotations.SerializedName

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: MovimentacaoTipo,
    @SerializedName("idConta")
    val idCorrentista: Int
)
