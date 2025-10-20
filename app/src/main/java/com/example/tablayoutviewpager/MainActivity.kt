package com.example.TaBLayoutViewPager // Sesuaikan dengan package name-mu


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tablayoutviewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Inisialisasi adapter
        val pagerAdapter = ViewPagerAdapter(this)

        // 2. Hubungkan adapter dengan ViewPager2
        binding.viewPager.adapter = pagerAdapter

        // 3. Hubungkan TabLayout dengan ViewPager2 menggunakan TabLayoutMediator
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            // Menentukan teks untuk setiap tab berdasarkan posisinya
            tab.text = when (position) {
                0 -> "Home"
                1 -> "Profile"
                else -> null
            }
        }.attach()
    }
}