package com.example.coba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val backbtn = findViewById<Button>(R.id.balik2)
        backbtn.setOnClickListener {
            val back = Intent(this, MainActivity2::class.java)
            startActivity(back)
            finish()
        }

        val btn_bawah: Button =findViewById(R.id.btn_sheet)

        btn_bawah.setOnClickListener {
            val view: View = layoutInflater.inflate(R.layout.activity_itembottomsheet,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }

        val nextbtn: Button = findViewById(R.id.ganti2)

        nextbtn.setOnClickListener {
            val next = Intent(this, MainActivity4::class.java)
            startActivity(next)
        }

    }
}