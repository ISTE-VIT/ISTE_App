package `in`.istevit.app.data.repository.home

import `in`.istevit.app.data.model.home.HomeAnnouncementsData
import `in`.istevit.app.data.model.home.HomeCarouselData
import retrofit2.Response
import retrofit2.http.GET

interface HomeRepo {
    @GET("/home/announcements/")
    suspend fun getAnnouncements(): Response<List<HomeAnnouncementsData>>

    @GET("/home/carousel/")
    suspend fun getCarousel(): Response<List<HomeCarouselData>>
}