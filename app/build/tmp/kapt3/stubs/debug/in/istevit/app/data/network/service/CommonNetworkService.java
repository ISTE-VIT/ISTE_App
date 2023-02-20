package in.istevit.app.data.network.service;

import in.istevit.app.data.model.*;
import in.istevit.app.data.model.home.HomeAnnouncementsData;
import in.istevit.app.data.model.home.HomeCarouselData;
import in.istevit.app.data.model.resources.ResourcesDetailModel;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lin/istevit/app/data/network/service/CommonNetworkService;", "", "getAnnouncements", "Lretrofit2/Response;", "", "Lin/istevit/app/data/model/home/HomeAnnouncementsData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogs", "Lin/istevit/app/data/model/BlogDetailsModel;", "getCarousel", "Lin/istevit/app/data/model/home/HomeCarouselData;", "getEvents", "Lin/istevit/app/data/model/EventDetailsModel;", "getFlagshipEvents", "Lin/istevit/app/data/model/FlagshipModel;", "getGallery", "Lin/istevit/app/data/model/GalleryModel;", "getProjects", "Lin/istevit/app/data/model/ProjectsModel;", "getResources", "Lin/istevit/app/data/model/resources/ResourcesDetailModel;", "res", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CommonNetworkService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/home/announcements/")
    public abstract java.lang.Object getAnnouncements(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.home.HomeAnnouncementsData>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/home/carousel/")
    public abstract java.lang.Object getCarousel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.home.HomeCarouselData>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/blogs/all/")
    public abstract java.lang.Object getBlogs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.BlogDetailsModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/events/all/")
    public abstract java.lang.Object getEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.EventDetailsModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/gallery/")
    public abstract java.lang.Object getGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.GalleryModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/flagship/")
    public abstract java.lang.Object getFlagshipEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.FlagshipModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/projects/")
    public abstract java.lang.Object getProjects(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.ProjectsModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/resources/find/{res}")
    public abstract java.lang.Object getResources(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "res")
    java.lang.String res, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<in.istevit.app.data.model.resources.ResourcesDetailModel>>> continuation);
}