package `in`.istevit.app.ui.projects

import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.data.repository.projects.ProjectsRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProjectsViewmodel: ViewModel() {
    private val repo:ProjectsRepoImpl = ProjectsRepoImpl()
    var projectsList = MutableLiveData<List<ProjectsModel>>()

    fun getProjects(){
        viewModelScope.launch {
            val temp = repo.getProjectsData()
            if(temp.isSuccess){
                projectsList.postValue(temp.getOrNull())
            }
        }
    }
}