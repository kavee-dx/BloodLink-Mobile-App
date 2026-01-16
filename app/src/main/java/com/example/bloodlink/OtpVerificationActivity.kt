package com.example.bloodlink

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.TextView
import androidx.core.view.WindowInsetsCompat

class OtpVerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otp_verification)

        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            // Navigate back to ForgotPasswordActivity
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
            finish() // optional: close current activity
        }

        val resendLink: TextView = findViewById(R.id.resendLink)
        resendLink.setOnClickListener {
            val intent = Intent(this, LinkResentActivity::class.java)
            startActivity(intent)
        }

        val verifyBtn = findViewById<Button>(R.id.btn_verify_otp)

        verifyBtn.setOnClickListener {
            val intent = Intent(this, SuccessVerified::class.java)
            startActivity(intent)

        }
    }
}
