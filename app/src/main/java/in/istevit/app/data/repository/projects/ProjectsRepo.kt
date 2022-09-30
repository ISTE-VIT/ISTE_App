package `in`.istevit.app.data.repository.projects

import `in`.istevit.app.data.model.ProjectsModel
import retrofit2.Response
import retrofit2.http.GET

interface ProjectsRepo {
    @GET("/projects/")
    suspend fun getProjects(): Response<List<ProjectsModel>>
}