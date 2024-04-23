package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast


class AutoComplete : AppCompatActivity() {
    private val language= arrayOf("Nepali","Hindi","English","Chinese")
    lateinit var autoComplete: AutoCompleteTextView
    lateinit var buttonClick: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoComplete=findViewById(R.id.AutoComplete)
        buttonClick=findViewById(R.id.btn)

        val autoCompleteAdapter= ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            language
        )
        autoComplete.setAdapter(autoCompleteAdapter)
        autoComplete.threshold=1

        buttonClick.setOnClickListener {
            Toast.makeText(this@AutoComplete,
                "This is a toast message",
                Toast.LENGTH_SHORT)
                .show()
        }
    }
}