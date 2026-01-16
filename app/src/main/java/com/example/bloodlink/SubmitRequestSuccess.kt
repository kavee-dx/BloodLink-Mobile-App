package com.example.bloodlink

import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class SubmitRequestSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_submit_request_success)

        val gifView: ImageView = findViewById(R.id.successGif)

        // Load GIF with Glide
        Glide.with(this)
            .asGif()
            .load(R.drawable.success) // put your gif in res/drawable
            .into(gifView)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, IncomingTransfers::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 2000ms = 2 seconds
        }
    }
