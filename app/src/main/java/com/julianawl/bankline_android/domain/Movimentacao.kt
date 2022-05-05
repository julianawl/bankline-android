package com.julianawl.bankline_android.domain

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: MovimentacaoTipo,
    val idCorrentista: Int
)
