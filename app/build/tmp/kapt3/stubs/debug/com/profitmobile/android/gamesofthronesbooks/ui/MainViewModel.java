package com.profitmobile.android.gamesofthronesbooks.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/profitmobile/android/gamesofthronesbooks/database/BookDatabase;", "(Lcom/profitmobile/android/gamesofthronesbooks/database/BookDatabase;)V", "allBooksLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/profitmobile/android/gamesofthronesbooks/database/Book;", "getAllBooksLiveData", "()Landroidx/lifecycle/MutableLiveData;", "alreadyReadBooksLiveData", "getAlreadyReadBooksLiveData", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "favoriteBooksLiveData", "getFavoriteBooksLiveData", "favoriteClicked", "", "book", "readClicked", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> allBooksLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> favoriteBooksLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> alreadyReadBooksLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.profitmobile.android.gamesofthronesbooks.database.BookDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> getAllBooksLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> getFavoriteBooksLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> getAlreadyReadBooksLiveData() {
        return null;
    }
    
    public final void favoriteClicked(@org.jetbrains.annotations.NotNull()
    com.profitmobile.android.gamesofthronesbooks.database.Book book) {
    }
    
    public final void readClicked(@org.jetbrains.annotations.NotNull()
    com.profitmobile.android.gamesofthronesbooks.database.Book book) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.profitmobile.android.gamesofthronesbooks.database.BookDatabase database) {
        super();
    }
}