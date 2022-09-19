package `in`.istevit.app.data.repository.blogs

import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.data.network.service.RetrofitService
import android.util.Log
import java.net.UnknownHostException

private const val TAG = "BlogsRepoImpl"

class BlogsRepoImpl {
    private val service = RetrofitService.getRetroInstance().create(BlogsRepo::class.java)

    suspend fun fetchEventsData(): Result<List<BlogDetailsModel>>{
        return try {
            val response = service.getBlogs()
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Log.d(TAG, response.message())
                Result.failure(Exception(response.errorBody().toString()))
            }
        } catch (e: UnknownHostException) {
            Log.e(TAG, e.stackTraceToString())
            Result.failure(e)
        } catch (e: Exception){
            Log.e(TAG, e.stackTraceToString())
            Result.failure(e)
        }
    }
}