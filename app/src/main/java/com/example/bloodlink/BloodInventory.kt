package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BloodInventory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_blood_inventory)

        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        // 🔹 Back button (go to Home)
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // close current NotificationActivity
        }

        val addNewStockBtn = findViewById<LinearLayout>(R.id.addStockButton)
        // or Button if you used <Button> instead of LinearLayout

        addNewStockBtn.setOnClickListener {
            val intent = Intent(this, AddNewStock::class.java)
            startActivity(intent)
        }
    }
}