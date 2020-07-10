package com.profitmobile.android.gamesofthronesbooks.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.profitmobile.android.gamesofthronesbooks.R
import com.profitmobile.android.gamesofthronesbooks.adapters.PageAdapter

class MainActivity : AppCompatActivity() {

  private lateinit var viewPager2: ViewPager2
  private lateinit var tabLayout: TabLayout

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    initToolbar()
    initView()
  }

  private fun initToolbar() {
    val toolbar: Toolbar = findViewById(R.id.toolbar)
    setSupportActionBar(toolbar)
    supportActionBar!!.setTitle("Game of Thrones books")

  }

  private fun initView() {
    viewPager2 = findViewById(R.id.view_pager)
    tabLayout = findViewById(R.id.tab_layout)
    viewPager2.adapter =
      PageAdapter(this)
    val tabLayoutMediator =
      TabLayoutMediator(tabLayout, viewPager2,
        TabLayoutMediator.TabConfigurationStrategy { tab, position ->
          when (position) {
            0 -> {
              tab.text = "List of Books"

            }
            1 -> {
              tab.text = "Favorites"


            }
            2 -> {
              tab.text = "Already Read"

            }
          }
        })
    tabLayoutMediator.attach()
  }
}
