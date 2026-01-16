package com.example.bloodlink

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.bumptech.glide.Glide
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loading)


        val loadingGif: ImageView = findViewById(R.id.loadingGif)

        // Load GIF using Glide
        Glide.with(this)
            .asGif()
            .load(R.drawable.loading)  // your GIF in drawable
            .into(loadingGif)


        // Wait 3 seconds → go to OTP Verification page
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OtpVerificationActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

        }
    }
