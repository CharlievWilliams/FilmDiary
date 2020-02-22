package com.charlie.filmdiary.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import butterknife.ButterKnife
import com.charlie.filmdiary.MainActivity
import com.charlie.filmdiary.MyApplication
import com.charlie.filmdiary.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        ButterKnife.bind(this)
        (applicationContext as MyApplication).appComponent.inject(this)

        setupAnimation()
    }

    private fun setupAnimation() {
        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                navigateToApp()
            }
        })
    }

    fun navigateToApp() {
        startActivity(MainActivity.newIntent(this))
    }


}