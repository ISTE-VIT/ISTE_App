package `in`.istevit.app.data.repository.projects

import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.data.network.service.RetrofitService
import android.util.Log
import java.net.UnknownHostException

const val TAG = "ProjectsRepoImpl"
class ProjectsRepoImpl {
    private val service = RetrofitService.getRetroInstance().create(ProjectsRepo::class.java)

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