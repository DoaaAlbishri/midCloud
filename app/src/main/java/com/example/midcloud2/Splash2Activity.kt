package com.example.midcloud2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import org.w3c.dom.Text

class Splash2Activity : AppCompatActivity() {
    var slide_up_anim: Animation? = null
    lateinit var LogoText:TextView
    lateinit var imageBackground:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
        LogoText = findViewById(R.id.LogoText)
        imageBackground = findViewById(R.id.imageBackground)

        imageBackground.translationY = 10000f
        imageBackground.animate()
            .translationY(0f)
            .setInterpolator(LinearInterpolator())
            .setStartDelay(1000)
            .start()
        imageBackground.isVisible = false

        LogoText.translationY = 400f
        LogoText.animate()
                .translationY(0f)
                .setStartDelay(1000)
                .start()
    }
}


//        slide_up_anim = AnimationUtils.loadAnimation(
//            applicationContext,
//            R.anim.slide_up
//        )
//LogoText.startAnimation(slide_up_anim)
//        Handler().postDelayed(Runnable {
//        }, 5000)