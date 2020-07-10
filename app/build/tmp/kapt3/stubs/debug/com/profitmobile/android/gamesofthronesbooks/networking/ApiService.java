package com.profitmobile.android.gamesofthronesbooks.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/networking/ApiService;", "", "searchBooks", "Lio/reactivex/Single;", "Lcom/profitmobile/android/gamesofthronesbooks/networking/ApiResponse;", "searchTerm", "", "Companion", "app_debug"})
public abstract interface ApiService {
    public static final com.profitmobile.android.gamesofthronesbooks.networking.ApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search.json")
    public abstract io.reactivex.Single<com.profitmobile.android.gamesofthronesbooks.networking.ApiResponse> searchBooks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchTerm);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/networking/ApiService$Companion;", "", "()V", "create", "Lcom/profitmobile/android/gamesofthronesbooks/networking/ApiService;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.profitmobile.android.gamesofthronesbooks.networking.ApiService create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}