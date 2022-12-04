package `in`.istevit.app.data.network.service

import `in`.istevit.app.data.model.*
import `in`.istevit.app.data.model.home.HomeAnnouncementsData
import `in`.istevit.app.data.model.home.HomeCarouselData
import retrofit2.Response
import retrofit2.http.GET

interface CommonNetworkService {
    // Home
    @GET("/home/announcements/")
    suspend fun getAnnouncements(): Response<List<HomeAnnouncementsData>>

    @GET("/home/carousel/")
    suspend fun getCarousel(): Response<List<HomeCarouselData>>

    // Blogs
    @GET("/blogs/all/")
    suspend fun getBlogs(): Response<List<BlogDetailsModel>>

    // Events
    @GET("/events/all/")
    suspend fun getEvents(): Response<List<EventDetailsModel>>

    // Gallery
    @GET("/gallery/")
    suspend fun getGallery(): Response<List<GalleryModel>>

    // Flagship
    @GET("/flagship/")
    suspend fun getFlagshipEvents(): Response<List<FlagshipModel>>

    // Projects
    @GET("/projects/")
    suspend fun getProjects(): Response<List<ProjectsModel>>
}