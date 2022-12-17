package `in`.istevit.app.ui.resources

import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.data.repository.ResourcesRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResourcesViewModel @Inject constructor(private val repo: ResourcesRepoImpl) : ViewModel() {
    var resourcesList = MutableLiveData<List<ResourcesDetailModel>>()

    fun getResources(topic: String) {
        viewModelScope.launch {
            val temp = repo.getResourcesData(topic)
            if (temp.isSuccess) resourcesList.postValue(temp.getOrNull())
        }
    }
}