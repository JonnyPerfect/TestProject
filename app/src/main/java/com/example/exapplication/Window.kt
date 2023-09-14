package com.example.exapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Window : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)

        val intent = intent

        if (intent != null && intent.hasExtra("key_from_fragment")){

        }
    }
}