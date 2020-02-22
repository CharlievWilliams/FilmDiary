package com.charlie.filmdiary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import butterknife.BindView
import butterknife.ButterKnife
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    @BindView(R.id.toolbar)
    lateinit var toolbar: androidx.appcompat.widget.Toolbar

    @BindView(R.id.bottom_navigation)
    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        (applicationContext as MyApplication).appComponent.inject(this)

        setupToolbar()
        setupViewNavigationEvents()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.diary_title)
    }

    private fun setupViewNavigationEvents() {
        bottomNav.setupWithNavController(Navigation.findNavController(this, R.id.nav_host_fragment))
        bottomNav.setOnNavigationItemSelectedListener { item ->
            onNavDestinationSelected(
                item,
                Navigation.findNavController(this, R.id.nav_host_fragment)
            )
        }
    }

    companion object {
        fun newIntent(context: Context): Intent? {
            return Intent(context, MainActivity::class.java)
        }
    }

}