package com.profitmobile.android.gamesofthronesbooks.database

import android.content.Context
import androidx.room.Room

object BookRoomDatabase {
  private var database: BookDatabase? = null

  fun fetchDatabase(context: Context): BookDatabase {
    val localDatabaseCopy = database
    return if (localDatabaseCopy != null) {
      localDatabaseCopy
    } else {
      val localDatabase = Room.databaseBuilder(context.applicationContext,
          BookDatabase::class.java, "book_database").build()
      database = localDatabase
      localDatabase
    }
  }
}