package in.istevit.app.data.database;

import in.istevit.app.data.model.GalleryModel;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {in.istevit.app.data.model.GalleryModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lin/istevit/app/data/database/ImagesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "imagesDao", "Lin/istevit/app/data/database/ImagesDao;", "app_release"})
public abstract class ImagesDatabase extends androidx.room.RoomDatabase {
    
    public ImagesDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract in.istevit.app.data.database.ImagesDao imagesDao();
}