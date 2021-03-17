package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Secondactivity: MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_lay)
        var counter = 0
        val myTex = findViewById<TextView>(R.id.textView2)
        val decreaseButton = findViewById<Button>(R.id.button_dec)
        val message2 = intent.getStringExtra("text")
        myTex.text = message2
        decreaseButton.setOnClickListener{
            counter--
            myTex.text = counter.toString()
        }
    }
}