package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Report : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_report)

        // Back button in header
        findViewById<View>(R.id.backButton).setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this@Report, HomeActivity::class.java)
            startActivity(intent)
            finish() // closes ReportActivity to prevent multiple instances
        }
        }
    }
