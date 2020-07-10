package com.profitmobile.android.gamesofthronesbooks.networking

import com.profitmobile.android.gamesofthronesbooks.database.Book
import io.reactivex.Single

object Api {
  const val API = "http://openlibrary.org/"
  private val service = ApiService.create()

  fun searchBooks(searchTerm: String): Single<List<Book>> {
    return service.searchBooks(searchTerm)
        .map { it.docs.distinctBy { book -> book.title } }
        .map { docs ->
          docs.map {
            val authorName = it.author_name?.firstOrNull() ?: "Unknown author"
            val subject = it.subject?.firstOrNull() ?: "Unknown subject"
            val publisher = it.publisher?.firstOrNull() ?: "Unknown publisher"
              Book(
                  it.title,
                  authorName,
                  publisher,
                  subject
              )
          }
        }
  }

}