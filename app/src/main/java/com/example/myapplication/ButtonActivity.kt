package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        val justText = findViewById<TextView>(R.id.justText)
        val textnum = intent.getIntExtra("num", 0)
        justText.setText("Here is a random number between 0 to "+textnum)

        val randomnum = findViewById<TextView>(R.id.randomnum)
        val selectnum = Random(textnum)
        randomnum.setText(selectnum.toString())

    }
}