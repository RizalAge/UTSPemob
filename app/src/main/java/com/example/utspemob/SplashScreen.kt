package com.example.utspemob

import android.os.Bundle
import android.content.Intent
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, LoginScreen::class.java))
            finish()
        }, 3000)
        }
    }