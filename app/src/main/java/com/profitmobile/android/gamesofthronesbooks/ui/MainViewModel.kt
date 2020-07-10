package com.profitmobile.android.gamesofthronesbooks.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.profitmobile.android.gamesofthronesbooks.database.Book
import com.profitmobile.android.gamesofthronesbooks.database.BookDatabase
import com.profitmobile.android.gamesofthronesbooks.networking.Api
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class MainViewModel(private val database: BookDatabase) : ViewModel() {
  val allBooksLiveData = MutableLiveData<List<Book>>()
  val favoriteBooksLiveData = MutableLiveData<List<Book>>()
  val alreadyReadBooksLiveData = MutableLiveData<List<Book>>()
  private val disposables = CompositeDisposable()

  init {
    val observable = Api.searchBooks("Game of Thrones")
        .retryWhen { it.delay(3, TimeUnit.SECONDS) }
        .subscribeOn(Schedulers.io())
        .flatMapCompletable { database.bookDao().insertBooks(it) }
        .andThen(database.bookDao().bookStream())
        .startWith(database.bookDao().bookStream().take(1))
        .share()


    observable
        .subscribeBy(
            onNext = { item -> allBooksLiveData.postValue(item) },
            onError = { print("Error: $it") }
        )
        .addTo(disposables)

    observable
        .map { books -> books.filter { it.isFavorited } }
        .subscribeBy(
            onNext = { item -> favoriteBooksLiveData.postValue(item) },
            onError = { print("Error: $it") }
        )
        .addTo(disposables)

    observable
        .map { books -> books.filter { it.isAlreadyRead} }
        .subscribeBy(
            onNext = { item -> alreadyReadBooksLiveData.postValue(item) },
            onError = { print("Error: $it") }
        )
        .addTo(disposables)
  }

  fun favoriteClicked(book: Book) {
    database.bookDao()
        .updateBook(book.copy(isFavorited = !book.isFavorited))
        .subscribeOn(Schedulers.io())
        .subscribe()
        .addTo(disposables)

  }

  fun readClicked(book: Book) {
      database.bookDao()
          .updateBook(book.copy(isAlreadyRead = !book.isAlreadyRead))
          .subscribeOn(Schedulers.io())
          .subscribe()
          .addTo(disposables)
  }
}