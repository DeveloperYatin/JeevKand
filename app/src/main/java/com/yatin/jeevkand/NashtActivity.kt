package com.yatin.jeevkand

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class NashtActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private val list = ArrayList<Int>()
    private lateinit var Jeevkand: Array<String>
    private lateinit var result: TextView
    private lateinit var name: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nasht)

        result = findViewById(R.id.result)
        name = findViewById(R.id.name)

        for (i in 1..80)
            list.add(i)

        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, list)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val input: Spinner = findViewById(R.id.input)

        with(input)
        {
            adapter = aa
            setSelection(0, false)
            onItemSelectedListener = this@NashtActivity
            prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        val key = intent.getStringExtra("key")

        if (key == "prastar1") {
            Jeevkand = resources.getStringArray(R.array.`प्रास्तार1`)
            name.text = resources.getString(R.string.`प्रस्तार1`)
            result.text = Jeevkand[0]

            /*input.doAfterTextChanged {
                if (!it.isNullOrBlank()) {
                    val number = Integer.parseInt(it.toString())
                    if (number in 1..80) result.text = Jeevkand[it.toString().toInt() - 1]
                    else result.text = resources.getString(R.string.`प्रस्तार1`)
                } else result.text = resources.getString(R.string.`प्रस्तार1`)
            }*/
        } else if (key == "prastar2") {
            Jeevkand = resources.getStringArray(R.array.`प्रास्तार2`)
            name.text = resources.getString(R.string.`प्रस्तार2`)
            result.text = Jeevkand[0]

            /*input.doAfterTextChanged {
                if (!it.isNullOrBlank()) {
                    val number = Integer.parseInt(it.toString())
                    if (number in 1..80) result.text = Jeevkand[it.toString().toInt() - 1]
                    else result.text = resources.getString(R.string.`प्रस्तार2`)
                } else result.text = resources.getString(R.string.`प्रस्तार2`)
            }*/
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        showToast(message = "Nothing selected")
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        result.text = Jeevkand[position]

        /*when (view?.id) {
            1 -> showToast(message = "Spinner 2 Position:${position} and language: ${list[position]}")
            else -> {
                showToast(message = "Spinner 1 Position:${position} and language: ${list[position]}")
            }
        }*/
    }

    private fun showToast(context: Context = applicationContext, message: String, duration: Int = Toast.LENGTH_LONG) {
        Toast.makeText(context, message, duration).show()
    }
}