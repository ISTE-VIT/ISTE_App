package `in`.istevit.app.data.repository.gallery

import `in`.istevit.app.data.model.GalleryModel
import `in`.istevit.app.data.network.service.RetrofitService
import android.util.Log
import java.net.UnknownHostException

private const val TAG = "GalleryRepoImpl"

class GalleryRepoImpl {
    private val service = RetrofitService.getRetroInstance().create(GalleryRepo::class.java)

    suspend fun fetchGalleryData(): Result<List<GalleryModel>>{
        return try {
            val response = service.getGallery()
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