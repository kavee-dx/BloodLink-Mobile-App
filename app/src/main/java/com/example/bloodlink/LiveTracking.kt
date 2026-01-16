package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LiveTracking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_live_tracking)

        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        // 🔙 Back Arrow
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            // Redirect to Transfer page
            val intent = Intent(this, Transfer::class.java)
            startActivity(intent)
            finish() // optional, remove current activity from stack
        }

        // View All Transfers button
        val viewAllTransfers: TextView = findViewById(R.id.viewTransfersBtn)
        viewAllTransfers.setOnClickListener {
            // Redirect to Transfer page
            val intent = Intent(this, Transfer::class.java)
            startActivity(intent)
        }
    }
}