package com.asoit.attendance.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<attendanceData> __insertionAdapterOfattendanceData;

  private final EntityDeletionOrUpdateAdapter<attendanceData> __deletionAdapterOfattendanceData;

  private final EntityDeletionOrUpdateAdapter<attendanceData> __updateAdapterOfattendanceData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfattendanceData = new EntityInsertionAdapter<attendanceData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `attendanceData` (`id`,`date`,`branch`,`sem`,`lecture`,`total`,`absent`,`note`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, attendanceData value) {
        stmt.bindLong(1, value.getId());
        if (value.getDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate());
        }
        if (value.getBranch() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBranch());
        }
        if (value.getSem() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSem());
        }
        if (value.getLecture() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLecture());
        }
        if (value.getTotal() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTotal());
        }
        if (value.getAbsent() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAbsent());
        }
        if (value.getNote() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getNote());
        }
      }
    };
    this.__deletionAdapterOfattendanceData = new EntityDeletionOrUpdateAdapter<attendanceData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `attendanceData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, attendanceData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfattendanceData = new EntityDeletionOrUpdateAdapter<attendanceData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `attendanceData` SET `id` = ?,`date` = ?,`branch` = ?,`sem` = ?,`lecture` = ?,`total` = ?,`absent` = ?,`note` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, attendanceData value) {
        stmt.bindLong(1, value.getId());
        if (value.getDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate());
        }
        if (value.getBranch() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBranch());
        }
        if (value.getSem() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSem());
        }
        if (value.getLecture() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLecture());
        }
        if (value.getTotal() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTotal());
        }
        if (value.getAbsent() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAbsent());
        }
        if (value.getNote() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getNote());
        }
        stmt.bindLong(9, value.getId());
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from attendanceData where id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertData(final attendanceData data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfattendanceData.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final attendanceData data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfattendanceData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final attendanceData data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfattendanceData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteById(final int idno) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, idno);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public List<attendanceData> getAllData() {
    final String _sql = "SELECT * FROM attendanceData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfBranch = CursorUtil.getColumnIndexOrThrow(_cursor, "branch");
      final int _cursorIndexOfSem = CursorUtil.getColumnIndexOrThrow(_cursor, "sem");
      final int _cursorIndexOfLecture = CursorUtil.getColumnIndexOrThrow(_cursor, "lecture");
      final int _cursorIndexOfTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "total");
      final int _cursorIndexOfAbsent = CursorUtil.getColumnIndexOrThrow(_cursor, "absent");
      final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
      final List<attendanceData> _result = new ArrayList<attendanceData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final attendanceData _item;
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpBranch;
        _tmpBranch = _cursor.getString(_cursorIndexOfBranch);
        final String _tmpSem;
        _tmpSem = _cursor.getString(_cursorIndexOfSem);
        final String _tmpLecture;
        _tmpLecture = _cursor.getString(_cursorIndexOfLecture);
        final String _tmpTotal;
        _tmpTotal = _cursor.getString(_cursorIndexOfTotal);
        final String _tmpAbsent;
        _tmpAbsent = _cursor.getString(_cursorIndexOfAbsent);
        final String _tmpNote;
        _tmpNote = _cursor.getString(_cursorIndexOfNote);
        _item = new attendanceData(_tmpDate,_tmpBranch,_tmpSem,_tmpLecture,_tmpTotal,_tmpAbsent,_tmpNote);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
