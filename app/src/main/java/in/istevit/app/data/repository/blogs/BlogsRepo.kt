package `in`.istevit.app.data.repository.blogs

import `in`.istevit.app.data.model.BlogDetailsModel
import retrofit2.Response
import retrofit2.http.GET

interface BlogsRepo {
    @GET("/blogs/all/")
    suspend fun getBlogs(): Response<List<BlogDetailsModel>>
}