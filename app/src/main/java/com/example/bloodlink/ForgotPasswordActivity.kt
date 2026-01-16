package com.example.bloodlink

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgot_password)


        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        val ivBackArrow = findViewById<ImageView>(R.id.backButton)
        val tvLoginHere = findViewById<TextView>(R.id.loginLink)

        // Back arrow click → go to LoginActivity
        ivBackArrow.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // optional (prevents going back here)
        }

        // "Login here" click → go to LoginActivity
        tvLoginHere.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // optional
        }

        val btnSendReset = findViewById<Button>(R.id.btn_send_reset)

        btnSendReset.setOnClickListener {
            val intent = Intent(this, LoadingActivity::class.java)
            startActivity(intent)
            finish() // optional (so user can’t go back here with back button)

        }
    }
}