package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val number = findViewById<TextView>(R.id.number)
        val intent = Intent(this, MainActivity2::class.java)

        val toast = findViewById<Button>(R.id.mybutton1)
        toast.setOnClickListener {
            Toast.makeText(this, "toast 메세지", Toast.LENGTH_LONG).show();
        }

        val count = findViewById<Button>(R.id.mybutton2)
        var num = 0
        count.setOnClickListener {
            num += 1
            number.setText(""+num)
            intent.putExtra("num", num)
        }

        val random = findViewById<Button>(R.id.mybutton3)
        random.setOnClickListener {
            intent.putExtra("num", num)
            startActivity(intent)
        }
    }
}
