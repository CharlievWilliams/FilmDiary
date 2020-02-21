package com.charlie.filmdiary

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (applicationContext as MyApplication).appComponent.inject(this)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val navigation = findViewById<View>(R.id.bottom_navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.screen1 -> {
                }
                R.id.screen2 -> {
                }
                R.id.screen3 -> {
                }
            }
            false
        }
    }


}