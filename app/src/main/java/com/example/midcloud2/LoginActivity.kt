package com.example.midcloud2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var createanaccount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }
}

/*
   createanaccount.setOnClickListener {
            val spannableString = SpannableString("Create new account")
            spannableString.setSpan(UnderlineSpan(), 0, spannableString.length, 0)
            createanaccount.text = spannableString
        }
 */