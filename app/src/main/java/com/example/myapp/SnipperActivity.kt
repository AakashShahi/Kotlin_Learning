package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner
import android.widget.TextView
import com.example.myapp.R

class SnipperActivity : AppCompatActivity () ,AdapterView.OnItemSelectedListener{
    lateinit var textView: TextView
    lateinit var spinner: Spinner
    var data = arrayOf("Nepal","China","India","Kora","USA","Pakistan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snipper)

        textView= findViewById(R.id.textView)
        spinner= findViewById(R.id.spinner)

        var adapter = ArrayAdapter(this@SnipperActivity,
            android.R.layout.simple_spinner_item,       // tempelate
            data        //dataset
            )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter=adapter
        spinner.onItemSelectedListener=this
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, index:  Int, id: Long) {
//        TODO("Not yet implemented")
        if(parent!=null) {
            textView.text=parent.getItemAtPosition(index).toString()
     }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
//        TODO("Not yet implemented")
    }
}