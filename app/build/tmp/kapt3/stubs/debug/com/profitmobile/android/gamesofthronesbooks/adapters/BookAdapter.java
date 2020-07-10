package com.profitmobile.android.gamesofthronesbooks.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/adapters/BookAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/profitmobile/android/gamesofthronesbooks/database/Book;", "Lcom/profitmobile/android/gamesofthronesbooks/adapters/BookViewHolder;", "bookClickListener", "Lcom/profitmobile/android/gamesofthronesbooks/adapters/BookAdapter$BookClickListener;", "(Lcom/profitmobile/android/gamesofthronesbooks/adapters/BookAdapter$BookClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookClickListener", "Companion", "app_debug"})
public final class BookAdapter extends androidx.recyclerview.widget.ListAdapter<com.profitmobile.android.gamesofthronesbooks.database.Book, com.profitmobile.android.gamesofthronesbooks.adapters.BookViewHolder> {
    private final com.profitmobile.android.gamesofthronesbooks.adapters.BookAdapter.BookClickListener bookClickListener = null;
    public static final com.profitmobile.android.gamesofthronesbooks.adapters.BookAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.profitmobile.android.gamesofthronesbooks.adapters.BookViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.profitmobile.android.gamesofthronesbooks.adapters.BookViewHolder holder, int position) {
    }
    
    public BookAdapter(@org.jetbrains.annotations.NotNull()
    com.profitmobile.android.gamesofthronesbooks.adapters.BookAdapter.BookClickListener bookClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/adapters/BookAdapter$BookClickListener;", "", "alreadyReadClicked", "", "book", "Lcom/profitmobile/android/gamesofthronesbooks/database/Book;", "favoriteClicked", "app_debug"})
    public static abstract interface BookClickListener {
        
        public abstract void favoriteClicked(@org.jetbrains.annotations.NotNull()
        com.profitmobile.android.gamesofthronesbooks.database.Book book);
        
        public abstract void alreadyReadClicked(@org.jetbrains.annotations.NotNull()
        com.profitmobile.android.gamesofthronesbooks.database.Book book);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/profitmobile/android/gamesofthronesbooks/adapters/BookAdapter$Companion;", "", "()V", "getDiffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/profitmobile/android/gamesofthronesbooks/database/Book;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.profitmobile.android.gamesofthronesbooks.database.Book> getDiffUtil() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}