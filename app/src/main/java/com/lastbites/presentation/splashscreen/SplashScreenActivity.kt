package com.lastbites.presentation.splashscreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.lastbites.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //to remove "information bar" above the action bar
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to remove the action bar (title bar)
        supportActionBar?.hide();
    }
}
