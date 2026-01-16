package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class LoginSuccessful : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_successful)

        val gifView: ImageView = findViewById(R.id.successGif)

        // Load GIF with Glide
        Glide.with(this)
            .asGif()
            .load(R.drawable.success) // put your gif in res/drawable
            .into(gifView)

        // Delay 2000ms (2 seconds) then navigate to HomeActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Close LoginSuccessfulActivity so user can't go back
        }, 2000)

        }
    }
