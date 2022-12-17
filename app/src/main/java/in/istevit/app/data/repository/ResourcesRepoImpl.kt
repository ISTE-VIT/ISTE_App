package `in`.istevit.app.data.repository

import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import java.net.UnknownHostException
import javax.inject.Inject

class ResourcesRepoImpl @Inject constructor(private val service: CommonNetworkService) {
    suspend fun getResourcesData(topic: String): Result<List<ResourcesDetailModel>> {
        return try {
            val response = service.getResources(topic)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Log.d(
                    "ResourcesRepoImpl.kt",
                    "VANDIT => getResourcesData:17 => ${response.message()}"
                )
                Result.failure(Exception(response.errorBody().toString()))
            }
        } catch (e: UnknownHostException) {
            Log.d(
                "ResourcesRepoImpl.kt",
                "VANDIT => getResourcesData:21 => ${e.stackTraceToString()}"
            )
            Result.failure(e)
        } catch (e: Exception) {
            Log.d(
                "ResourcesRepoImpl.kt",
                "VANDIT => getResourcesData:24 => ${e.stackTraceToString()}"
            )
            Result.failure(e)
        }
    }
}