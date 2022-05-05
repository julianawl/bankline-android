package com.julianawl.bankline_android.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.julianawl.bankline_android.R
import com.julianawl.bankline_android.databinding.ActivityWelcomeBinding
import com.julianawl.bankline_android.domain.Correntista
import com.julianawl.bankline_android.ui.statement.BankStatementActivity

class WelcomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btContinue.setOnClickListener {
            val accountId = binding.etAccountHolderId.text.toString().toInt()
            val account = Correntista(accountId)

            val intent = Intent(this, BankStatementActivity::class.java).apply {
                putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, account)
            }
            startActivity(intent)
        }
    }
}