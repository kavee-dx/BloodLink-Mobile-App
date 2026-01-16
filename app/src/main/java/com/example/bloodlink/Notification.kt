package com.example.bloodlink

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification)

        // 🔹 Back button (go to Home)
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // close current NotificationActivity
        }

        // First notification box → Urgent Request Page
        val notificationBox1 = findViewById<LinearLayout>(R.id.notification_list)
        notificationBox1.setOnClickListener {
            val intent = Intent(this, UrgentRequest::class.java)
            startActivity(intent)
        }
    }
}