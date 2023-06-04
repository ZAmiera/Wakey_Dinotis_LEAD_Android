package com.example.myapplication070523.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.myapplication070523.R
import com.example.myapplication070523.ui.login_selector.LoginSelectorActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lifecycleScope.launch{
            delay(2000)
            navigateToSelector()
        }



    }
    private fun navigateToSelector(){
        //
    }
}