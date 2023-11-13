package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderingapp.databinding.ActivityLoginnBinding

class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginnBinding by lazy {
        ActivityLoginnBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener {
            val intent=Intent(this, SignActivity::class.java)
            startActivity(intent)
        }
        binding.dontHaveAcc.setOnClickListener {
            val intent=Intent(this, SignActivity::class.java)
            startActivity((intent))
        }
    }
}