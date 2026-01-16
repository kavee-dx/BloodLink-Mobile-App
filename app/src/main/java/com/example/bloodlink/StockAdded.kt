package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StockAdded : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stock_added)


        val okButton: Button = findViewById(R.id.okButton)
        val addAnotherButton: Button = findViewById(R.id.addAnotherButton)

        // Navigate back to Blood Inventory
        okButton.setOnClickListener {
            val intent = Intent(this, BloodInventory::class.java)
            // Clear previous activities so user goes "home"
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

        // Navigate to Add New Stock again
        addAnotherButton.setOnClickListener {
            val intent = Intent(this, AddNewStock::class.java)
            startActivity(intent)
            finish()

        }
    }
}