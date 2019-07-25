package com.example.rentalmobil2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.halaman_depan.*
import kotlinx.android.synthetic.main.layout_mobil.*

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_depan)

        btnpesan.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnaboutus.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }
}