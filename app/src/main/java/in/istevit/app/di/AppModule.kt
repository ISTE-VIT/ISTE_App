package `in`.istevit.app.di

import `in`.istevit.app.data.database.ImagesDao
import `in`.istevit.app.data.database.ImagesDatabase
import `in`.istevit.app.data.network.service.CommonNetworkService
import `in`.istevit.app.data.network.service.RetrofitService
import `in`.istevit.app.data.repository.blogs.BlogsRepoImpl
import `in`.istevit.app.data.repository.events.EventsRepoImpl
import `in`.istevit.app.data.repository.flagship.FlagshipRepoImpl
import `in`.istevit.app.data.repository.gallery.GalleryRepoImpl
import `in`.istevit.app.data.repository.home.HomeRepoImpl
import `in`.istevit.app.data.repository.projects.ProjectsRepoImpl
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
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
    @Singleton
    fun provideHomeRepository(service: CommonNetworkService): HomeRepoImpl{
        return HomeRepoImpl(service)
    }

    @Provides
    @Singleton
    fun provideBlogsRepository(service: CommonNetworkService): BlogsRepoImpl{
        return BlogsRepoImpl(service)
    }

    @Provides
    @Singleton
    fun provideEventsRepository(service: CommonNetworkService): EventsRepoImpl{
        return EventsRepoImpl(service)
    }

    @Provides
    @Singleton
    fun provideFlagshipRepository(service: CommonNetworkService): FlagshipRepoImpl{
        return FlagshipRepoImpl(service)
    }

    @Provides
    @Singleton
    fun provideProjectsRepository(service: CommonNetworkService): ProjectsRepoImpl{
        return ProjectsRepoImpl(service)
    }

    @Provides
    @Singleton
    fun provideGalleryRepository(dao: ImagesDao, service: CommonNetworkService): GalleryRepoImpl{
        return GalleryRepoImpl(dao, service)
    }
}