package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreateNewPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_new_password)

        val submitBtn = findViewById<Button>(R.id.btn_submit)

        submitBtn.setOnClickListener {
            val intent = Intent(this, ResetPasswordSuccess::class.java)
            startActivity(intent)
        }

        val backArrow = findViewById<ImageView>(R.id.backButton)

        // When click back arrow → go to ForgotPasswordActivity
        backArrow.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}