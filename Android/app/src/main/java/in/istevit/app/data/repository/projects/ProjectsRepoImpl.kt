package `in`.istevit.app.data.repository.projects

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import java.net.UnknownHostException
import javax.inject.Inject

class ProjectsRepoImpl @Inject constructor(private val service: CommonNetworkService, context: Context) {

    private val ai: ApplicationInfo = context.packageManager
        .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
    private val value = ai.metaData["API_KEY"]
    private val key = value.toString()

    suspend fun getProjectsData(): Result<List<ProjectsModel>> {
        return try {
            val response = service.getProjects(key)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Log.d(
                    "ProjectsRepoImpl.kt",
                    "VANDIT => getProjectsData:18 => ${response.message()}"
                )
                Result.failure(Exception(response.errorBody().toString()))
            }
        } catch (e: UnknownHostException) {
            Log.d(
                "ProjectsRepoImpl.kt",
                "VANDIT => getProjectsData:22 => ${e.stackTraceToString()}"
            )
            Result.failure(e)
        } catch (e: Exception) {
            Log.d(
                "ProjectsRepoImpl.kt",
                "VANDIT => getProjectsData:26 => ${e.stackTraceToString()}"
            )
            Result.failure(e)
        }
    }
}