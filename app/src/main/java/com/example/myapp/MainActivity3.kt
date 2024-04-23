package com.example.sample

import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapp.R
import com.google.android.material.snackbar.Snackbar

class MainActivity3 : AppCompatActivity() {
    lateinit var checkBoxToast: CheckBox
    lateinit var checkBoxSnack: CheckBox
    lateinit var checkBoxAlert: CheckBox
    lateinit var buttonClick: Button
    lateinit var main : ConstraintLayout
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        checkBoxToast= findViewById(R.id.checkboxToast)
        checkBoxSnack= findViewById(R.id.checkBoxSnackbar)
        checkBoxAlert= findViewById(R.id.checkBoxAlert)
        buttonClick = findViewById(R.id.button) // Add this line to initialize buttonClick
        main= findViewById(R.id.main)

        if(checkBoxToast.isChecked){
                checkBoxSnack.isSelected=false
                checkBoxAlert.isSelected=false
        }
        else if(checkBoxSnack.isSelected){
            checkBoxToast.isSelected=false
            checkBoxAlert.isSelected=false
        }
        else if(checkBoxAlert.isSelected){
            checkBoxToast.isSelected=false
            checkBoxSnack.isSelected=false
        }



        buttonClick.setOnClickListener {
            if (checkBoxToast.isChecked){
                //toast
                Toast.makeText(this@MainActivity3,
                    "This is a toast message",
                    Toast.LENGTH_SHORT)
                    .show()
            }
            else if (checkBoxSnack.isChecked){
                //snackbar
                val snackbar= Snackbar.make(main, "This is snack bar", Snackbar.LENGTH_LONG)
                snackbar.setActionTextColor(getColor(R.color.white))

                snackbar.setAction("Close", View.OnClickListener {

                }).show()
            }else{
                //Alert Dilaouge
                val alertDialog= AlertDialog.Builder(this@MainActivity3)
                alertDialog.setTitle("Confrim")
                    .setMessage("Are you sure?")
                    .setCancelable(false)
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->  })
                    //What if user pressed no
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->  })
                alertDialog.create().show()
            }
        }
    }
}
