package `in`.istevit.app.data.repository.projects

import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import java.net.UnknownHostException
import javax.inject.Inject

const val TAG = "ProjectsRepoImpl"
class ProjectsRepoImpl @Inject constructor(private val service: CommonNetworkService){

    suspend fun getProjectsData(): Result<List<ProjectsModel>>{
        return try {
            val response = service.getProjects()
            if(response.isSuccessful){
                Result.success(response.body()!!)
            }  else {
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