package com.yatin.jeevkand

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val nashtPrastar1BTN: MaterialButton = findViewById(R.id.nashtPrastar1BTN)
        val nashtPrastar2BTN: MaterialButton = findViewById(R.id.nashtPrastar2BTN)
        val samudishtPrastar1BTN: MaterialButton = findViewById(R.id.samudishtPrastar1BTN)
        val samudishtPrastar2BTN: MaterialButton = findViewById(R.id.samudishtPrastar2BTN)

        nashtPrastar1BTN.setOnClickListener { startActivity(Intent(this, NashtActivity::class.java).putExtra("key", "prastar1")) }
        nashtPrastar2BTN.setOnClickListener { startActivity(Intent(this, NashtActivity::class.java).putExtra("key", "prastar2")) }

        samudishtPrastar1BTN.setOnClickListener { startActivity(Intent(this, SamudishtActivity::class.java).putExtra("key", "prastar1")) }
        samudishtPrastar2BTN.setOnClickListener { startActivity(Intent(this, SamudishtActivity::class.java).putExtra("key", "prastar2")) }

    }
}