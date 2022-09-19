package `in`.istevit.app.data.repository.gallery

import `in`.istevit.app.data.model.GalleryModel
import retrofit2.Response
import retrofit2.http.GET

interface GalleryRepo {
    @GET("/gallery/")
    suspend fun getGallery(): Response<List<GalleryModel>>
}