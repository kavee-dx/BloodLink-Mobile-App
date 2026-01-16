package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddRequest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_request)

        // Back Button
        val backBtn = findViewById<ImageView>(R.id.backButton)
        backBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // close AddRequest page
        }

        val submitButton = findViewById<Button>(R.id.submitButton) // replace with your button ID
        submitButton.setOnClickListener {
            val intent = Intent(this, SubmitRequestSuccess::class.java)
            startActivity(intent)
        }
        }
    }
