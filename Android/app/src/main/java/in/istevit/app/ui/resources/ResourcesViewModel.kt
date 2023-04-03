package `in`.istevit.app.ui.resources

import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import `in`.istevit.app.util.Result
import `in`.istevit.app.util.getResult
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResourcesViewModel @Inject constructor(
    private val service: CommonNetworkService
) : ViewModel() {
    private val _resourcesList = MutableLiveData<Result<List<ResourcesDetailModel>>>()
    val resourcesList: LiveData<Result<List<ResourcesDetailModel>>>
        get() = _resourcesList

    fun fetchResources(topic: String) {
        viewModelScope.launch {
            _resourcesList.postValue(Result.Loading())
            val data = getResult { service.getResources(topic) }
            _resourcesList.postValue(data)
        }
    }
}