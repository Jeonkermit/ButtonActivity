package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = findViewById<TextView>(R.id.number)
        val intent = Intent(this, ButtonActivity::class.java)

        val toastButton = findViewById<Button>(R.id.myButton1)
        toastButton.setOnClickListener {
            Toast.makeText(this, "toast 메세지", Toast.LENGTH_LONG).show()
        }

        val countButton = findViewById<Button>(R.id.myButton2)
        var num = 0
        countButton.setOnClickListener {
            num += 1
            number.text=num.toString()
            intent.putExtra("num", num)
        }

        val randomButton = findViewById<Button>(R.id.myButton3)
        randomButton.setOnClickListener {
            intent.putExtra("num", num)
            startActivity(intent)
        }
    }
}