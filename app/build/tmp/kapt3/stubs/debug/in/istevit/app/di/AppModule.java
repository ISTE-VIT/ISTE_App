package in.istevit.app.di;

import in.istevit.app.data.database.ImagesDao;
import in.istevit.app.data.database.ImagesDatabase;
import in.istevit.app.data.network.service.CommonNetworkService;
import in.istevit.app.data.network.service.RetrofitService;
import in.istevit.app.data.repository.ResourcesRepoImpl;
import in.istevit.app.data.repository.blogs.BlogsRepoImpl;
import in.istevit.app.data.repository.events.EventsRepoImpl;
import in.istevit.app.data.repository.flagship.FlagshipRepoImpl;
import in.istevit.app.data.repository.gallery.GalleryRepoImpl;
import in.istevit.app.data.repository.home.HomeRepoImpl;
import in.istevit.app.data.repository.projects.ProjectsRepoImpl;
import android.content.Context;
import androidx.room.Room;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001c"}, d2 = {"Lin/istevit/app/di/AppModule;", "", "()V", "provideBlogsRepository", "Lin/istevit/app/data/repository/blogs/BlogsRepoImpl;", "service", "Lin/istevit/app/data/network/service/CommonNetworkService;", "provideCommonNetworkService", "provideEventsRepository", "Lin/istevit/app/data/repository/events/EventsRepoImpl;", "provideFlagshipRepository", "Lin/istevit/app/data/repository/flagship/FlagshipRepoImpl;", "provideGalleryDao", "Lin/istevit/app/data/database/ImagesDao;", "imagesDatabase", "Lin/istevit/app/data/database/ImagesDatabase;", "provideGalleryDatabase", "context", "Landroid/content/Context;", "provideGalleryRepository", "Lin/istevit/app/data/repository/gallery/GalleryRepoImpl;", "dao", "provideHomeRepository", "Lin/istevit/app/data/repository/home/HomeRepoImpl;", "provideProjectsRepository", "Lin/istevit/app/data/repository/projects/ProjectsRepoImpl;", "provideResourcesData", "Lin/istevit/app/data/repository/ResourcesRepoImpl;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final in.istevit.app.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.database.ImagesDatabase provideGalleryDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.database.ImagesDao provideGalleryDao(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.database.ImagesDatabase imagesDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.network.service.CommonNetworkService provideCommonNetworkService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.repository.home.HomeRepoImpl provideHomeRepository(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.repository.blogs.BlogsRepoImpl provideBlogsRepository(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.repository.events.EventsRepoImpl provideEventsRepository(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.repository.flagship.FlagshipRepoImpl provideFlagshipRepository(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.repository.projects.ProjectsRepoImpl provideProjectsRepository(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.repository.gallery.GalleryRepoImpl provideGalleryRepository(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.database.ImagesDao dao, @org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.istevit.app.data.repository.ResourcesRepoImpl provideResourcesData(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        return null;
    }
}