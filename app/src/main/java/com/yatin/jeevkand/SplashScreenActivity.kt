package com.yatin.jeevkand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.android.material.button.MaterialButton

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val prastar1BTN: MaterialButton = findViewById(R.id.prastar1BTN)
        val prastar2BTN: MaterialButton = findViewById(R.id.prastar2BTN)

        prastar1BTN.setOnClickListener {startActivity(Intent(this, MainActivity::class.java).putExtra("key","prastar1"))}
        prastar2BTN.setOnClickListener {startActivity(Intent(this, MainActivity::class.java).putExtra("key","prastar2"))}
    }
}