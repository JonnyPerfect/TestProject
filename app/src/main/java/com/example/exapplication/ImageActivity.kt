package com.example.exapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val animation = AnimationUtils.loadAnimation(this, R.anim.common_animation)

        val img = findViewById<ImageView>(R.id.animatorImg)

        img.setImageResource(R.drawable.zhivotnye_kot_sobaka_prikol_1764)

        img.startAnimation(animation)

    }
}