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
        val textNum = intent.getIntExtra("num", 0)
        justText.text="Here is a random number between 0 to "+textNum

        val randomNum = findViewById<TextView>(R.id.randomNum)
        val selectNum = (0..textNum!!.toInt())
        randomNum.text=selectNum.random().toString()

    }
}
