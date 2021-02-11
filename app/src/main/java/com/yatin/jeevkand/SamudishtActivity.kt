package com.yatin.jeevkand

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SamudishtActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var listVikatha: Array<String>
    private lateinit var listKashay: Array<String>
    private lateinit var listIndriya: Array<String>
    private lateinit var Jeevkand: Array<String>
    private lateinit var result: TextView
    private lateinit var name: TextView
    private var jeevkandString: String = ""
    private var key: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samudisht)

        result = findViewById(R.id.result)
        name = findViewById(R.id.name)

        /*for (i in 1..80)
            list.add(i)*/

        listVikatha = resources.getStringArray(R.array.`विकथा`)
        listKashay = resources.getStringArray(R.array.`कषाय`)
        listIndriya = resources.getStringArray(R.array.`इन्द्रिय`)



        key = intent.getStringExtra("key")!!

        if (key == "prastar1") {
            Jeevkand = resources.getStringArray(R.array.`प्रास्तार1`)
            name.text = resources.getString(R.string.`प्रस्तार1`)
            result.text = "1"
            jeevkandString = Jeevkand[0]

            /*------------initialization--------*/

            val aaVikatha = ArrayAdapter(this, android.R.layout.simple_spinner_item, listVikatha)
            aaVikatha.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val input1: Spinner = findViewById(R.id.input1)

            with(input1)
            {
                id = R.id.input1
                adapter = aaVikatha
                setSelection(0, false)
                onItemSelectedListener = this@SamudishtActivity
                gravity = Gravity.CENTER
            }

            val aaKashay = ArrayAdapter(this, android.R.layout.simple_spinner_item, listKashay)
            aaKashay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val input2: Spinner = findViewById(R.id.input2)

            with(input2)
            {
                id = R.id.input2
                adapter = aaKashay
                setSelection(0, false)
                onItemSelectedListener = this@SamudishtActivity
                gravity = Gravity.CENTER
            }

            val aaIndriya = ArrayAdapter(this, android.R.layout.simple_spinner_item, listIndriya)
            aaIndriya.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val input3: Spinner = findViewById(R.id.input3)

            with(input3)
            {
                id = R.id.input3
                adapter = aaIndriya
                setSelection(0, false)
                onItemSelectedListener = this@SamudishtActivity
                gravity = Gravity.CENTER
            }

            /*------------initialization--------*/

        } else if (key == "prastar2") {
            Jeevkand = resources.getStringArray(R.array.`प्रास्तार2`)
            name.text = resources.getString(R.string.`प्रस्तार2`)
            result.text = "1"
            jeevkandString = Jeevkand[0]

            /*------------initialization--------*/

            val aaVikatha = ArrayAdapter(this, android.R.layout.simple_spinner_item,listIndriya)
            aaVikatha.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val input1: Spinner = findViewById(R.id.input1)

            with(input1)
            {
                id = R.id.input1
                adapter = aaVikatha
                setSelection(0, false)
                onItemSelectedListener = this@SamudishtActivity
                gravity = Gravity.CENTER
            }

            val aaKashay = ArrayAdapter(this, android.R.layout.simple_spinner_item, listKashay)
            aaKashay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val input2: Spinner = findViewById(R.id.input2)

            with(input2)
            {
                id = R.id.input2
                adapter = aaKashay
                setSelection(0, false)
                onItemSelectedListener = this@SamudishtActivity
                gravity = Gravity.CENTER
            }

            val aaIndriya = ArrayAdapter(this, android.R.layout.simple_spinner_item, listVikatha)
            aaIndriya.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val input3: Spinner = findViewById(R.id.input3)

            with(input3)
            {
                id = R.id.input3
                adapter = aaIndriya
                setSelection(0, false)
                onItemSelectedListener = this@SamudishtActivity
                gravity = Gravity.CENTER
            }

            /*------------initialization--------*/

        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        showToast(message = "Nothing selected")
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        if(key == "prastar1"){
            when (parent!!.id) {
                R.id.input1 -> {
                    jeevkandString = "${listVikatha[position]},${jeevkandString.split(",")[1]},${jeevkandString.split(",")[2]},${jeevkandString.split(",")[3]},${jeevkandString.split(",")[4]}"
                    //showToast(message = "Spinner 1 Position:${jeevkandString}")
                    getPosition(jeevkandString)
                }
                R.id.input2 -> {
                    jeevkandString = "${jeevkandString.split(",")[0]},${listKashay[position]},${jeevkandString.split(",")[2]},${jeevkandString.split(",")[3]},${jeevkandString.split(",")[4]}"
                    //showToast(message = "Spinner 1 Position:${jeevkandString}")
                    getPosition(jeevkandString)
                }
                R.id.input3 -> {
                    jeevkandString = "${jeevkandString.split(",")[0]},${jeevkandString.split(",")[1]},${listIndriya[position]},${jeevkandString.split(",")[3]},${jeevkandString.split(",")[4]}"
                    //showToast(message = "Spinner 1 Position:${jeevkandString}")
                    getPosition(jeevkandString)
                }
                else -> {
                    showToast(message = "Spinner else Position:${parent.id} ")
                }
            }
        }else {
            when (parent!!.id) {
                R.id.input1 -> {
                    jeevkandString = "${listIndriya[position]},${jeevkandString.split(",")[1]},${jeevkandString.split(",")[2]},${jeevkandString.split(",")[3]},${jeevkandString.split(",")[4]}"
                    //showToast(message = "Spinner 1 Position:${jeevkandString}")
                    getPosition(jeevkandString)
                }
                R.id.input2 -> {
                    jeevkandString = "${jeevkandString.split(",")[0]},${listKashay[position]},${jeevkandString.split(",")[2]},${jeevkandString.split(",")[3]},${jeevkandString.split(",")[4]}"
                    //showToast(message = "Spinner 1 Position:${jeevkandString}")
                    getPosition(jeevkandString)
                }
                R.id.input3 -> {
                    jeevkandString = "${jeevkandString.split(",")[0]},${jeevkandString.split(",")[1]},${listVikatha[position]},${jeevkandString.split(",")[3]},${jeevkandString.split(",")[4]}"
                    //showToast(message = "Spinner 1 Position:${jeevkandString}")
                    getPosition(jeevkandString)
                }
                else -> {
                    showToast(message = "Spinner else Position:${parent.id} ")
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun getPosition(jeevkandString: String) {
        for (i in 0 until Jeevkand.size) {
            if (jeevkandString == Jeevkand[i]) result.text = "${i + 1}"
        }
    }

    private fun showToast(context: Context = applicationContext, message: String, duration: Int = Toast.LENGTH_LONG) {
        Toast.makeText(context, message, duration).show()
    }
}