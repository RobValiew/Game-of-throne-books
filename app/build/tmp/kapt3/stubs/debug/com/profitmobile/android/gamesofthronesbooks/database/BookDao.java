package com.profitmobile.android.gamesofthronesbooks.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/database/BookDao;", "", "bookStream", "Lio/reactivex/Observable;", "", "Lcom/profitmobile/android/gamesofthronesbooks/database/Book;", "insertBooks", "Lio/reactivex/Completable;", "books", "updateBook", "Lio/reactivex/Single;", "", "book", "app_debug"})
public abstract interface BookDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract io.reactivex.Completable insertBooks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book> books);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from book ORDER BY title")
    public abstract io.reactivex.Observable<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> bookStream();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Single<java.lang.Integer> updateBook(@org.jetbrains.annotations.NotNull()
    com.profitmobile.android.gamesofthronesbooks.database.Book book);
}