package com.example.TaBLayoutViewPager // Sesuaikan dengan package name-mu

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutviewpager.HomeFragment
import com.example.tablayoutviewpager.ProfileFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    // Jumlah total tab/halaman yang kita miliki
    override fun getItemCount(): Int {
        return 2
    }

    // Fungsi ini dipanggil oleh ViewPager untuk membuat fragment
    // pada posisi tertentu.
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()    // Posisi 0 untuk tab Home
            1 -> ProfileFragment()  // Posisi 1 untuk tab Profile
            else -> throw IllegalStateException("Posisi tidak valid")
        }
    }
}