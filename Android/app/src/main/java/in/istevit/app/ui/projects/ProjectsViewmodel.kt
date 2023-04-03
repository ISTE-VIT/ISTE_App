package `in`.istevit.app.ui.projects

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import `in`.istevit.app.util.Result
import `in`.istevit.app.util.getResult
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProjectsViewmodel @Inject constructor(
    private val service: CommonNetworkService
) : ViewModel() {
    private val _projectsList = MutableLiveData<Result<List<ProjectsModel>>>()
    val projectsList: LiveData<Result<List<ProjectsModel>>>
        get() = _projectsList

    init {
        fetchProjects()
    }

    fun fetchProjects() {
        viewModelScope.launch {
            _projectsList.postValue(Result.Loading())
            val data = getResult { service.getProjects() }
            _projectsList.postValue(data)
        }
    }
}