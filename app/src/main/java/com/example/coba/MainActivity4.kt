package com.example.coba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val backbtn = findViewById<Button>(R.id.balik3)
        backbtn.setOnClickListener {
            val back = Intent(this, MainActivity3::class.java)
            startActivity(back)
            finish()

        }
    }
}