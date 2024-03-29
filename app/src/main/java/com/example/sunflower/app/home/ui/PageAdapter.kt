package com.example.sunflower.app.home.ui

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlin.reflect.KClass

class PageAdapter(
    fragment: Fragment,
    private val tabFragmentList: List<KClass<*>>
): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return this.tabFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return this.tabFragmentList[position].java.newInstance() as Fragment
    }
}