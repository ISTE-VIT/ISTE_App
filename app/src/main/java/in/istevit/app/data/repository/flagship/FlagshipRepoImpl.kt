package `in`.istevit.app.data.repository.flagship

import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.data.network.service.RetrofitService
import android.util.Log
import java.net.UnknownHostException

private const val TAG = "FlagshipRepoImpl"
class FlagshipRepoImpl {
    private val service = RetrofitService.getRetroInstance().create(FlagshipRepo::class.java)

    suspend fun fetchFlagshipData(): Result<List<FlagshipModel>>{
        return try {
            val response = service.getFlagshipEvents()
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