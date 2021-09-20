package com.shubhamranswal.famoji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.shubhamranswal.famoji.adapter.ViewPagerAdapter
import kotlin.concurrent.fixedRateTimer

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        setUpFragment()
    }

    private fun setUpFragment() {
        val adapter = ViewPagerAdapter (supportFragmentManager)

        adapter.addFragment(AuthFragment(), "Auth method chooser")
        adapter.addFragment(SignupFragment(), "Signup")
        adapter.addFragment(LoginFragment(), "Login")
        adapter.addFragment(AutoAuthFragment(), "Auto Auth")

        val viewPager : ViewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter
        viewPager.currentItem=3



    }
}