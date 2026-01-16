package com.example.bloodlink

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btn_login)
        val forgotPassword: TextView = findViewById(R.id.forgot_password)
        val createAccount: TextView = findViewById(R.id.create_account)
        val rememberCheck: CheckBox = findViewById(R.id.checkbox_remember)

        btnLogin.setOnClickListener {
            // Navigate to LoginSuccessfulActivity
            val intent = Intent(this, LoginSuccessful::class.java)
            startActivity(intent)
        }

        // Forgot Password → ForgotPasswordActivity
        forgotPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        // Create Account → SignupActivity
        createAccount.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}