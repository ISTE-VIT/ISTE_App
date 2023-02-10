package `in`.istevit.app.ui.projects

import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.data.repository.projects.ProjectsRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProjectsViewmodel @Inject constructor(private val repo:ProjectsRepoImpl): ViewModel() {
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