package com.example.midcloud2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    lateinit var Lletter: TextView
    lateinit var Oletter: TextView
    lateinit var Gletter: TextView
    lateinit var O2letter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Lletter = findViewById(R.id.Lletter)
        //Oletter = findViewById(R.id.Oletter)
        //Gletter = findViewById(R.id.Gletter)
       // O2letter = findViewById(R.id.O2letter)

        Handler().postDelayed({ Lletter.setText("L") }, 600)
        Handler().postDelayed({ Lletter.append("O") }, 900)
        Handler().postDelayed({ Lletter.append("G") }, 1200)
        Handler().postDelayed({ Lletter.append("O") }, 1500)
        Handler().postDelayed({
            val i = Intent(
                this, BloodProductDetailsActivity::class.java //Splash2Activity
            )
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }, 2000)


//        Lletter.alpha = 0f
//        Oletter.alpha = 0f
//        Gletter.alpha = 0f
//        O2letter.alpha = 0f
//
//        Lletter.animate().setDuration(1500).alpha(1f).withEndAction {
//            Oletter.animate().setDuration(1500).alpha(1f).withEndAction {
//                Gletter.animate().setDuration(1500).alpha(1f).withEndAction {
//                    O2letter.animate().setDuration(1500).alpha(1f).withEndAction {
//                        val i = Intent(
//                            this, Splash2Activity::class.java
//                        )
//                        startActivity(i)
//                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
//                        finish()
//                    }
//                }
//            }
//        }
    }
}


/*
        <TextView
            android:id="@+id/Oletter"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="@font/cairo"
            android:text="O"
            android:textColor="@color/white"
            android:textSize="100dp" />
        <TextView
            android:id="@+id/Gletter"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="@font/cairo"
            android:text="G"
            android:textColor="@color/white"
            android:textSize="100dp" />
        <TextView
            android:id="@+id/O2letter"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="@font/cairo"
            android:text="O"
            android:textColor="@color/white"
            android:textSize="100dp" />
 */