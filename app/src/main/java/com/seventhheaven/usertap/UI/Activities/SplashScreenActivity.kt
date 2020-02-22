package com.seventhheaven.usertap.UI.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.seventhheaven.usertap.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Wait for 5 seconds to open MainActivity

        Handler().postDelayed({ startActivity(Intent(this, MainActivity::class.java)) }, 5000)

    }
}
