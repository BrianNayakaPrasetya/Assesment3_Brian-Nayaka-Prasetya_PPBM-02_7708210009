package com.example.coba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.ncorti.slidetoact.SlideToActView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val backbtn:Button = findViewById(R.id.balik)
        backbtn.setOnClickListener {
            val balik = Intent(this,MainActivity::class.java)
            startActivity(balik)
            finish()
        }


        val SlideToActView = findViewById<SlideToActView>(R.id.example)
        SlideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                Log.d("galihasharir", "slide1: " + view.text + ", id: " + view.id)

                val _intent = Intent(this@MainActivity2,MainActivity3::class.java)

                startActivity(_intent)

            }
        }

    }
}
