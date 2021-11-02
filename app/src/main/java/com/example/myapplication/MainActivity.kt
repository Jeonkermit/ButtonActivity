package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val number = findViewById<TextView>(R.id.number)
        val intent = Intent(this, ButtonActivity::class.java)

        val toastButton = findViewById<Button>(R.id.myButton1)
        toastButton.setOnClickListener {
            Toast.makeText(this, "toast 메세지", Toast.LENGTH_LONG).show();
        }

        val countButton = findViewById<Button>(R.id.myButton2)
        var num = 0
        countButton.setOnClickListener {
            num += 1
            number.setText(num.toString())
            intent.putExtra("num", num)
        }

        val randomButton = findViewById<Button>(R.id.myButton3)
        randomButton.setOnClickListener {
            intent.putExtra("num", num)
            startActivity(intent)
        }
    }
}
