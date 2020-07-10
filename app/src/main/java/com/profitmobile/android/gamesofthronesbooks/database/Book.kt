package com.profitmobile.android.gamesofthronesbooks.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    @PrimaryKey
    val title: String,
    val authorName: String,
    val publisher: String,
    val subject: String,
    val isFavorited: Boolean = false,
    val isAlreadyRead: Boolean = false)