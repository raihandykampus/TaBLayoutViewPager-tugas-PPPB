package com.example.tablayoutviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutviewpager.HomeFragment
import com.example.tablayoutviewpager.ProfileFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    // 1. Tentukan jumlah tab
    override fun getItemCount(): Int {
        return 2
    }

    // 2. Tentukan fragment untuk setiap posisi
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()    // Posisi 0 (Tab pertama)
            1 -> ProfileFragment() // Posisi 1 (Tab kedua)
            else -> throw IllegalStateException("Posisi tidak valid")
        }
    }
}