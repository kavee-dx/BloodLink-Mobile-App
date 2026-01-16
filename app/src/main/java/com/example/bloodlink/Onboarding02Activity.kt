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
private lateinit var btnNext2: Button

class Onboarding02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding02)

                btnNext2 = findViewById(R.id.btn_next2)

                btnNext2.setOnClickListener {
                    val intent = Intent(this, Onboarding03Activity::class.java)
                    startActivity(intent)

                }
    }
}