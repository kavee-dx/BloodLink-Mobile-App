package com.example.bloodlink

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.graphics.toColorInt

class Transfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transfer)

        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        val navTransfers: LinearLayout = findViewById(R.id.nav_transfers)
        val textTransfers: TextView = navTransfers.findViewById(R.id.text_transfers)

// highlight Transfers
        navTransfers.setBackgroundColor("#e53935".toColorInt())
        textTransfers.setTextColor(Color.WHITE)


        // --- Bottom Navigation ---
        val navHome: LinearLayout = findViewById(R.id.nav_home)
        navHome.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }


        // --- Bottom Navigation ---
        val navTips: LinearLayout = findViewById(R.id.nav_tips)
        navTips.setOnClickListener {
            startActivity(Intent(this, Tips::class.java))
            finish()
        }

        // --- Bottom Navigation ---
        val navProfile: LinearLayout = findViewById(R.id.nav_profile)
        navProfile.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
            finish()
        }

        // --- Bottom Navigation ---
        val navGoals: LinearLayout = findViewById(R.id.nav_goals)
        navGoals.setOnClickListener {
            startActivity(Intent(this, Goals::class.java))
            finish()
        }

// --- Notification click ---
        val notificationIcon: ImageView = findViewById(R.id.notificationIcon)
        notificationIcon.setOnClickListener {
            startActivity(Intent(this, Notification::class.java))
        }

        // Find boxes by ID
        val outgoingTransferBox = findViewById<LinearLayout>(R.id.outgoingTransfersBtn)
        val incomingTransferBox = findViewById<LinearLayout>(R.id.incomingTransfersBtn)

        // Navigate to Outgoing Transfer page
        outgoingTransferBox.setOnClickListener {
            val intent = Intent(this, OutgoingTransfers::class.java)
            startActivity(intent)
        }

        // Navigate to Incoming Transfer page
        incomingTransferBox.setOnClickListener {
            val intent = Intent(this, IncomingTransfers::class.java)
            startActivity(intent)
        }
    }
}
