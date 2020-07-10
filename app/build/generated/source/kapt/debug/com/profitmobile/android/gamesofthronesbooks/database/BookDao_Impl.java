package com.profitmobile.android.gamesofthronesbooks.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class BookDao_Impl implements BookDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBook;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfBook;

  public BookDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBook = new EntityInsertionAdapter<Book>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Book`(`title`,`authorName`,`publisher`,`subject`,`isFavorited`,`isAlreadyRead`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Book value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getAuthorName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthorName());
        }
        if (value.getPublisher() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPublisher());
        }
        if (value.getSubject() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSubject());
        }
        final int _tmp;
        _tmp = value.isFavorited() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isAlreadyRead() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
      }
    };
    this.__updateAdapterOfBook = new EntityDeletionOrUpdateAdapter<Book>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `Book` SET `title` = ?,`authorName` = ?,`publisher` = ?,`subject` = ?,`isFavorited` = ?,`isAlreadyRead` = ? WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Book value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getAuthorName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthorName());
        }
        if (value.getPublisher() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPublisher());
        }
        if (value.getSubject() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSubject());
        }
        final int _tmp;
        _tmp = value.isFavorited() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isAlreadyRead() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
      }
    };
  }

  @Override
  public Completable insertBooks(List<Book> books) {
    return Completable.fromCallable(new Callable() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBook.insert(books);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Single<Integer> updateBook(Book book) {
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfBook.handle(book);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Observable<List<Book>> bookStream() {
    final String _sql = "SELECT * from book ORDER BY title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, new String[]{"book"}, new Callable<List<Book>>() {
      @Override
      public List<Book> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfAuthorName = _cursor.getColumnIndexOrThrow("authorName");
          final int _cursorIndexOfPublisher = _cursor.getColumnIndexOrThrow("publisher");
          final int _cursorIndexOfSubject = _cursor.getColumnIndexOrThrow("subject");
          final int _cursorIndexOfIsFavorited = _cursor.getColumnIndexOrThrow("isFavorited");
          final int _cursorIndexOfIsAlreadyRead = _cursor.getColumnIndexOrThrow("isAlreadyRead");
          final List<Book> _result = new ArrayList<Book>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Book _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpAuthorName;
            _tmpAuthorName = _cursor.getString(_cursorIndexOfAuthorName);
            final String _tmpPublisher;
            _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
            final String _tmpSubject;
            _tmpSubject = _cursor.getString(_cursorIndexOfSubject);
            final boolean _tmpIsFavorited;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorited);
            _tmpIsFavorited = _tmp != 0;
            final boolean _tmpIsAlreadyRead;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsAlreadyRead);
            _tmpIsAlreadyRead = _tmp_1 != 0;
            _item = new Book(_tmpTitle,_tmpAuthorName,_tmpPublisher,_tmpSubject,_tmpIsFavorited,_tmpIsAlreadyRead);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
