package in.istevit.app.data.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import in.istevit.app.data.model.GalleryModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImagesDao_Impl implements ImagesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GalleryModel> __insertionAdapterOfGalleryModel;

  public ImagesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGalleryModel = new EntityInsertionAdapter<GalleryModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `GalleryModel` (`_id`,`image`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GalleryModel value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
        if (value.getImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImage());
        }
      }
    };
  }

  @Override
  public Object insertAll(final List<GalleryModel> galeryImages,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGalleryModel.insert(galeryImages);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<GalleryModel>> getAllImages() {
    final String _sql = "SELECT * FROM gallerymodel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"gallerymodel"}, false, new Callable<List<GalleryModel>>() {
      @Override
      public List<GalleryModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<GalleryModel> _result = new ArrayList<GalleryModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GalleryModel _item;
            final String _tmp_id;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmp_id = null;
            } else {
              _tmp_id = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new GalleryModel(_tmp_id,_tmpImage);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
