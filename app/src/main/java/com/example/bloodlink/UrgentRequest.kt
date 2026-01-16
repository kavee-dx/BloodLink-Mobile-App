package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UrgentRequest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_urgent_request)

        // Back button → Go back to HomeActivity
        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // ✅ Accept Request Button → Live Tracking Page
        val acceptButton = findViewById<Button>(R.id.acceptRequestBtn)
        acceptButton.setOnClickListener {
            val intent = Intent(this, LiveTracking::class.java)
            startActivity(intent)
        }
        }
    }
