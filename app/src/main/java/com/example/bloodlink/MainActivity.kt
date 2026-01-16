package com.example.bloodlink

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Delay for 3 seconds then go to Onboarding1Activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Onboarding01Activity::class.java)
            startActivity(intent)

        }, 3000) // 3000 = 3 seconds


        }
    }
