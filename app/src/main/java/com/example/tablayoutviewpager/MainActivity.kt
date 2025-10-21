package com.example.tablayoutviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tablayoutviewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    // Gunakan ViewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate layout menggunakan ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Inisialisasi Adapter
        val pagerAdapter = ViewPagerAdapter(this)

        // 2. Hubungkan Adapter ke ViewPager
        binding.viewPager.adapter = pagerAdapter

        // 3. Hubungkan TabLayout dengan ViewPager
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            // Beri nama untuk setiap tab
            tab.text = when (position) {
                0 -> "Home"
                1 -> "Profile"
                else -> null
            }
        }.attach()
    }
}