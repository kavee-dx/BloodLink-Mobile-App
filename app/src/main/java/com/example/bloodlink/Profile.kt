package com.example.bloodlink

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        val navProfile: LinearLayout = findViewById(R.id.nav_profile)
        val textProfile: TextView = navProfile.findViewById(R.id.text_profile)

// highlight Profile
        navProfile.setBackgroundColor("#e53935".toColorInt())
        textProfile.setTextColor(Color.WHITE)

        // --- Notification click ---
        val notificationIcon: ImageView = findViewById(R.id.notificationIcon)
        notificationIcon.setOnClickListener {
            startActivity(Intent(this, Notification::class.java))
        }

        // --- Bottom Navigation ---
        val navHome: LinearLayout = findViewById(R.id.nav_home)
        navHome.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // --- Bottom Navigation ---
        val navTransfers: LinearLayout = findViewById(R.id.nav_transfers)
        navTransfers.setOnClickListener {
            startActivity(Intent(this, Transfer::class.java))
            finish()
        }

        // --- Bottom Navigation ---
        val navGoals: LinearLayout = findViewById(R.id.nav_goals)
        navGoals.setOnClickListener {
            startActivity(Intent(this, Goals::class.java))
            finish()
        }

        // --- Bottom Navigation ---
        val navTips: LinearLayout = findViewById(R.id.nav_tips)
        navTips.setOnClickListener {
            startActivity(Intent(this, Tips::class.java))
            finish()
        }

        val changePasswordRow = findViewById<LinearLayout>(R.id.changePasswordRow)
        changePasswordRow.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

    }
}