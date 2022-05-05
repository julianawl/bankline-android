package com.julianawl.bankline_android.ui.statement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.julianawl.bankline_android.databinding.ActivityBankStatementBinding
import com.julianawl.bankline_android.domain.Correntista

class BankStatementActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER)
            ?: throw IllegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    companion object {
        const val EXTRA_ACCOUNT_HOLDER =
            "com.julianawl.bankline_android.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }
}