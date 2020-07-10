package com.profitmobile.android.gamesofthronesbooks.ui

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.profitmobile.android.gamesofthronesbooks.database.BookRoomDatabase

fun Fragment.mainViewModel(context: Context): MainViewModel {
  return ViewModelProviders.of(this, object : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
      val db = BookRoomDatabase.fetchDatabase(context)
      return MainViewModel(db) as T
    }
  }).get(MainViewModel::class.java)
}