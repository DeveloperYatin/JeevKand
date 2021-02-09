package com.yatin.jeevkand

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input: EditText = findViewById(R.id.input)
        val result: TextView = findViewById(R.id.result)

        val key = intent.getStringExtra("key")

        if (key == "prastar1") {
            val Jeevkand = resources.getStringArray(R.array.`प्रास्तार1`)
            result.text = resources.getString(R.string.`प्रस्तार1`)

            input.doAfterTextChanged {
                if (!it.isNullOrBlank()) {
                    val number = Integer.parseInt(it.toString())
                    if (number in 1..80) result.text = Jeevkand[it.toString().toInt() - 1]
                    else result.text = resources.getString(R.string.`प्रस्तार1`)
                } else result.text = resources.getString(R.string.`प्रस्तार1`)
            }
        } else if (key == "prastar2") {
            val Jeevkand = resources.getStringArray(R.array.`प्रास्तार2`)
            result.text = resources.getString(R.string.`प्रस्तार2`)

            input.doAfterTextChanged {
                if (!it.isNullOrBlank()) {
                    val number = Integer.parseInt(it.toString())
                    if (number in 1..80) result.text = Jeevkand[it.toString().toInt() - 1]
                    else result.text = resources.getString(R.string.`प्रस्तार2`)
                } else result.text = resources.getString(R.string.`प्रस्तार2`)
            }
        }


    }
}