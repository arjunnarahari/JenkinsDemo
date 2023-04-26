package com.example.jenkinstestapplication.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jenkinstestapplication.databinding.ActivityLoginBinding
import com.example.jenkinstestapplication.helper.Constants

class LoginActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        eventListeners()
    }

    private fun eventListeners() {
        binding.btnGoToHome.setOnClickListener {
            startActivity(
                Intent(context, HomeActivity::class.java)
                    .apply {
                        putExtra(Constants.SOURCE, "from activity "+Constants.LOGIN_ACTIIVITY)
                    })
        }
    }
}