package com.profitmobile.android.gamesofthronesbooks.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/networking/Api;", "", "()V", "API", "", "service", "Lcom/profitmobile/android/gamesofthronesbooks/networking/ApiService;", "searchBooks", "Lio/reactivex/Single;", "", "Lcom/profitmobile/android/gamesofthronesbooks/database/Book;", "searchTerm", "app_debug"})
public final class Api {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API = "http://openlibrary.org/";
    private static final com.profitmobile.android.gamesofthronesbooks.networking.ApiService service = null;
    public static final com.profitmobile.android.gamesofthronesbooks.networking.Api INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.profitmobile.android.gamesofthronesbooks.database.Book>> searchBooks(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm) {
        return null;
    }
    
    private Api() {
        super();
    }
}