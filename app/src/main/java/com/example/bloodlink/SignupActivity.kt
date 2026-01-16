package com.example.bloodlink

import android.content.Intent
import android.widget.TextView
import android.widget.Button
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.ar.imp.view.View


class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_signup)

        val loginLink = findViewById<TextView>(R.id.loginLink)

        loginLink.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)

        btnCreateAccount.setOnClickListener {
            // Normally you would save account info to DB here
            val intent = Intent(this, AccountCreatedActivity::class.java)
            startActivity(intent)
        }

        }

}