package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IncomingTransfers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_incoming_transfers)


        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        // 🔙 Back Arrow → Transfer Page
        val backArrow = findViewById<ImageView>(R.id.backButton)
        backArrow.setOnClickListener {
            val intent = Intent(this, Transfer::class.java)
            startActivity(intent)
            finish() // optional
        }

        // 🗺️ View Live Map Box 1
        val viewLiveMap1 = findViewById<LinearLayout>(R.id.viewLiveMap1)
        viewLiveMap1.setOnClickListener {
            val intent = Intent(this, LiveTracking::class.java)
            startActivity(intent)
        }

    }

}