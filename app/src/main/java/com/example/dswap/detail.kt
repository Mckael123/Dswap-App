package com.example.dswap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()
    }
}