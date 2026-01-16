package com.example.bloodlink

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LinkResentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_link_resent)


        val loadingGif: ImageView = findViewById(R.id.loadingGif)

        // Load your GIF from drawable
        Glide.with(this)
            .asGif()
            .load(R.drawable.loading) // place your GIF in res/drawable/loading.gif
            .into(loadingGif)


        // Navigate after 2000ms to Link Reset Successfully Page
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LinkResentSuccessfully::class.java)
            startActivity(intent)
            finish()
        }, 2000)
        }
    }
