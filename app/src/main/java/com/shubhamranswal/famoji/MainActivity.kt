package com.shubhamranswal.famoji

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.shubhamranswal.famoji.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()

    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter (supportFragmentManager)

        adapter.addFragment(HomeFragment(), "")
        adapter.addFragment(CameraFragment(), "")
        adapter.addFragment(ChatFragment(), "")

        val viewPager : ViewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter
        viewPager.currentItem=1


        val bottomBar : TabLayout = findViewById(R.id.bottomBar)
        bottomBar.setupWithViewPager(viewPager)

        bottomBar.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        bottomBar.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_camera_alt_24)
        bottomBar.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_format_list_bulleted_24)
    }


}

