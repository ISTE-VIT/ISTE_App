package `in`.istevit.app.ui.projects

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.ProjectsModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import `in`.istevit.app.data.network.service.CommonNetworkService
import `in`.istevit.app.util.Result
import `in`.istevit.app.util.getResult
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProjectsViewmodel @Inject constructor(
    @ApplicationContext context: Context,
    private val service: CommonNetworkService
) : ViewModel() {
    private val _projectsList = MutableLiveData<Result<List<ProjectsModel>>>()
    val projectsList: LiveData<Result<List<ProjectsModel>>>
        get() = _projectsList

    init {
        val ai: ApplicationInfo = context.packageManager
            .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        val value = ai.metaData["API_KEY"]
        val key = value.toString()
        fetchProjects(key)
    }

    fun fetchProjects(key: String) {
        viewModelScope.launch {
            _projectsList.postValue(Result.Loading())
            val data = getResult { service.getProjects(key) }
            _projectsList.postValue(data)
        }
    }
}