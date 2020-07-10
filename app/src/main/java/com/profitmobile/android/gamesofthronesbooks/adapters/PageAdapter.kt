package com.profitmobile.android.gamesofthronesbooks.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.profitmobile.android.gamesofthronesbooks.ui.AlreadyReadFragment
import com.profitmobile.android.gamesofthronesbooks.ui.DiscoveryFragment
import com.profitmobile.android.gamesofthronesbooks.ui.FavoritesFragment

class PageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DiscoveryFragment()
            1 -> FavoritesFragment()
            else -> AlreadyReadFragment()
        }
    }


}
