package com.charlie.filmdiary.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import com.charlie.filmdiary.MyApplication
import com.charlie.filmdiary.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        (applicationContext as MyApplication).appComponent.inject(this)
    }
}