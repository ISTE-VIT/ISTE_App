package `in`.istevit.app.data.repository

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import java.net.UnknownHostException
import javax.inject.Inject

class ResourcesRepoImpl @Inject constructor(private val service: CommonNetworkService, context: Context) {

    private val ai: ApplicationInfo = context.packageManager
        .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
    private val value = ai.metaData["API_KEY"]
    private val key = value.toString()

    suspend fun getResourcesData(topic: String): Result<List<ResourcesDetailModel>> {
        return try {
            val response = service.getResources(topic, key)
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