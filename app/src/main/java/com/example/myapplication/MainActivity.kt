package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Display the UI. R = resources
        setContentView(R.layout.activity_main)
        //TODO continue your work here
        //val = value , var = variable
        val buttonShowName : Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener(showName());
    }

    private fun showName(): View.OnClickListener? {

        textViewName.setText("Narein")

    }
}

