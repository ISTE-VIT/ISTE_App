package `in`.istevit.app.data.repository.flagship

import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import java.net.UnknownHostException
import javax.inject.Inject

private const val TAG = "FlagshipRepoImpl"
class FlagshipRepoImpl @Inject constructor(private val service: CommonNetworkService){

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