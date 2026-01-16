package com.example.bloodlink

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.view.View
import kotlin.math.roundToInt
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.toColorInt
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Remove padding from status bar inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, 0, 0, systemBars.bottom) // 🔴 removes top padding
            insets
        }

        val navHome: LinearLayout = findViewById(R.id.nav_home)
        val textHome: TextView = navHome.findViewById(R.id.text_home)

// highlight Transfers
        navHome.setBackgroundColor("#e53935".toColorInt())
        textHome.setTextColor(Color.WHITE)

// optional: reset others if needed (they are grey by default)

        val scrollView: HorizontalScrollView = findViewById(R.id.urgentCardsScroll)
        val dotsLayout: LinearLayout = findViewById(R.id.dotsLayout)
        val cardContainer: LinearLayout =
            findViewById(R.id.urgentCardsContainer) // replace with your urgent cards LinearLayout

        val dotsCount = cardContainer.childCount
        val dots = Array(dotsCount) { ImageView(this) }

// Create dots dynamically
        for (i in 0 until dotsCount) {
            dots[i] = ImageView(this).apply {
                setImageDrawable(resources.getDrawable(R.drawable.circle_empty, null))
            }

            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(6, 0, 6, 0)
            }

            dotsLayout.addView(dots[i], params)
        }

// First dot active
        dots[0].setImageDrawable(resources.getDrawable(R.drawable.circle_filled, null))

// Scroll listener to update dots
        scrollView.viewTreeObserver.addOnScrollChangedListener {
            val scrollX = scrollView.scrollX
            val childWidth = cardContainer.getChildAt(0).width + 12 // card width + margin
            val currentDot = (scrollX.toFloat() / childWidth).roundToInt()

            for (i in 0 until dotsCount) {
                dots[i].setImageDrawable(
                    if (i == currentDot) resources.getDrawable(R.drawable.circle_filled, null)
                    else resources.getDrawable(R.drawable.circle_empty, null)
                )
            }
        }

        // 🔹 Find notification icon
        val notificationIcon: ImageView = findViewById(R.id.notificationIcon)

        // 🔹 Go to NotificationActivity when clicked
        notificationIcon.setOnClickListener {
            val intent = Intent(this, Notification::class.java)
            startActivity(intent)
        }

        // Add Request Box
        val addRequestBox = findViewById<LinearLayout>(R.id.addRequestBox) // change ID to yours
        addRequestBox.setOnClickListener {
            val intent = Intent(this, AddRequest::class.java)
            startActivity(intent)

        }

        //inventory box
        val inventoryBox: LinearLayout = findViewById(R.id.inventoryBox)

        inventoryBox.setOnClickListener {
            val intent = Intent(this@HomeActivity, BloodInventory::class.java)
            startActivity(intent)
        }

        //report box
        findViewById<View>(R.id.reportsBox).setOnClickListener {
            // Navigate to ReportActivity
            val intent = Intent(this@HomeActivity, Report::class.java)
            startActivity(intent)
        }

        // Urgent box → UrgentRequestActivity
        val urgentBox = findViewById<LinearLayout>(R.id.urgentCard1)
        urgentBox.setOnClickListener {
            val intent = Intent(this, UrgentRequest::class.java)
            startActivity(intent)
        }

        // Second box → AnotherActivity (example: ReportActivity)
        val reportBox = findViewById<LinearLayout>(R.id.urgentCard2)
        reportBox.setOnClickListener {
            val intent = Intent(this, UrgentRequest::class.java)
            startActivity(intent)
        }

        // Third box → AnotherActivity (example: DonationActivity)
        val donationBox = findViewById<LinearLayout>(R.id.urgentCard3)
        donationBox.setOnClickListener {
            val intent = Intent(this, UrgentRequest::class.java)
            startActivity(intent)
        }

        // --- Bottom Navigation ---
        val navTransfers: LinearLayout = findViewById(R.id.nav_transfers)
        navTransfers.setOnClickListener {
            startActivity(Intent(this, Transfer::class.java))
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
        }

    }


