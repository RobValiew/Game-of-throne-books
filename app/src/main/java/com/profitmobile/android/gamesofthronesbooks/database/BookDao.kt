package com.profitmobile.android.gamesofthronesbooks.database

import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

@Dao
interface BookDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertBooks(books: List<Book>): Completable


    @Query("SELECT * from book ORDER BY title")
    fun bookStream(): Observable<List<Book>>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateBook(book: Book): Single<Int>
}