package `in`.istevit.app.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import `in`.istevit.app.data.database.ImagesDao
import `in`.istevit.app.data.database.ImagesDatabase
import `in`.istevit.app.data.network.service.CommonNetworkService
import `in`.istevit.app.data.network.service.RetrofitService
import `in`.istevit.app.data.repository.gallery.GalleryRepoImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideGalleryDatabase(@ApplicationContext context: Context): ImagesDatabase{
        synchronized(this){
            return Room.databaseBuilder(context, ImagesDatabase::class.java, "galleryDB").build()
        }
    }

    @Provides
    @Singleton
    fun provideGalleryDao(imagesDatabase: ImagesDatabase): ImagesDao{
        return imagesDatabase.imagesDao()
    }

    @Provides
    @Singleton
    fun provideCommonNetworkService(): CommonNetworkService {
        return RetrofitService.getRetroInstance().create(CommonNetworkService::class.java)
    }

    @Provides
    fun provideGalleryRepository(dao: ImagesDao, service: CommonNetworkService): GalleryRepoImpl{
        return GalleryRepoImpl(dao, service)
    }
}