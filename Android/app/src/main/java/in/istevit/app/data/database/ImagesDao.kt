package `in`.istevit.app.data.database

import `in`.istevit.app.data.model.GalleryModel
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Dao
interface ImagesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(galeryImages: List<GalleryModel>)

    @Query("SELECT * FROM gallerymodel")
    fun getAllImages(): LiveData<List<GalleryModel>>
}