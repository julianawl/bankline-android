package com.julianawl.bankline_android.ui.statement

import androidx.lifecycle.ViewModel
import com.julianawl.bankline_android.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountId: Int) =
        BanklineRepository.findBankStatement(accountId)
}