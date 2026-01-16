package com.example.bloodlink

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@SuppressLint("StaticFieldLeak")
private lateinit var btnNext: Button

class Onboarding01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding01)

        btnNext = findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            val intent = Intent(this, Onboarding02Activity::class.java)
            startActivity(intent)

        }
    }
}