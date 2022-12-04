package `in`.istevit.app.data.database

import `in`.istevit.app.data.model.GalleryModel
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [GalleryModel::class], version = 1)
abstract class ImagesDatabase: RoomDatabase() {
    abstract fun imagesDao(): ImagesDao
}