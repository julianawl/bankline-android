package com.julianawl.bankline_android.ui.statement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.julianawl.bankline_android.R
import com.julianawl.bankline_android.databinding.BankStatementItemBinding
import com.julianawl.bankline_android.domain.Movimentacao
import com.julianawl.bankline_android.domain.MovimentacaoTipo

/**
 * Reference: https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=pt-br#kotlin
 */
class BankStatementAdapter(private val dataSet: List<Movimentacao>) :
    RecyclerView.Adapter<BankStatementAdapter.ViewHolder>() {

    class ViewHolder(private val binding: BankStatementItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movimentacao) = with(binding) {
            tvDescription.text = item.descricao
            tvDatetime.text = item.dataHora
            tvValue.text = item.valor.toString()
            val typeIcon = if (MovimentacaoTipo.RECEITA == item.tipo) R.drawable.ic_money_on
            else R.drawable.ic_money_out
            ivIcon.setImageResource(typeIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            BankStatementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        viewHolder.bind(item)
    }

    override fun getItemCount() = dataSet.size
}