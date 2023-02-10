package `in`.istevit.app.data.network.service

import `in`.istevit.app.data.model.*
import `in`.istevit.app.data.model.home.HomeAnnouncementsData
import `in`.istevit.app.data.model.home.HomeCarouselData
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface CommonNetworkService {
    // Home
    @GET("/home/announcements/")
    suspend fun getAnnouncements(@Header("api_key") api_key: String): Response<List<HomeAnnouncementsData>>

    @GET("/home/carousel/")
    suspend fun getCarousel(@Header("api_key") api_key: String): Response<List<HomeCarouselData>>

    // Blogs
    @GET("/blogs/all/")
    suspend fun getBlogs(@Header("api_key") api_key: String): Response<List<BlogDetailsModel>>

    // Events
    @GET("/events/all/")
    suspend fun getEvents(@Header("api_key") api_key: String): Response<List<EventDetailsModel>>

    // Gallery
    @GET("/gallery/")
    suspend fun getGallery(@Header("api_key") api_key: String): Response<List<GalleryModel>>

    // Flagship
    @GET("/flagship/")
    suspend fun getFlagshipEvents(@Header("api_key") api_key: String): Response<List<FlagshipModel>>

    // Projects
    @GET("/projects/")
    suspend fun getProjects(@Header("api_key") api_key: String): Response<List<ProjectsModel>>

    // Resources
    @GET("/resources/find/{res}")
    suspend fun getResources(@Path("res") res: String, @Header("api_key") api_key: String): Response<List<ResourcesDetailModel>>
}