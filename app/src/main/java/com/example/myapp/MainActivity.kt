package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    lateinit var radioApple: RadioButton
    lateinit var radioSamsung: RadioButton
    lateinit var radioOppo: RadioButton
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioApple=findViewById(R.id.btnApple)
        radioSamsung=findViewById(R.id.btnSamsung)
        radioOppo=findViewById(R.id.btnOppo)
        image=findViewById(R.id.imageView2)

        radioApple.setOnClickListener {
           image.setImageResource(R.drawable.download)
        }
        radioSamsung.setOnClickListener {
           image.setImageResource(R.drawable.images)
        }
        radioOppo.setOnClickListener {
           image.setImageResource(R.drawable.oppo)
        }

    }
}