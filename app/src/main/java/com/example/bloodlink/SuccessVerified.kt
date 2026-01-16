package com.example.bloodlink

import android.os.Bundle
import android.widget.ImageView
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.os.Looper
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class SuccessVerified : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_success_verified)

        val gifView: ImageView = findViewById(R.id.successGif)

        // Load GIF with Glide
        Glide.with(this)
            .asGif()
            .load(R.drawable.success) // put your gif in res/drawable
            .into(gifView)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, CreateNewPassword::class.java)
            startActivity(intent)
            finish()
        }, 2000)
        }
    }
