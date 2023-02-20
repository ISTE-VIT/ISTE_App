package `in`.istevit.app.ui.events

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.EventDetailsModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import `in`.istevit.app.data.network.service.CommonNetworkService
import `in`.istevit.app.util.Result
import `in`.istevit.app.util.getResult
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventsViewmodel @Inject constructor(
    @ApplicationContext context: Context,
    private val service: CommonNetworkService
) : ViewModel() {
    private val _eventsList = MutableLiveData<Result<List<EventDetailsModel>>>()
    val eventsList: LiveData<Result<List<EventDetailsModel>>>
        get() = _eventsList

    init {
        val ai: ApplicationInfo = context.packageManager
            .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        val value = ai.metaData["API_KEY"]
        val key = value.toString()
        fetchEvents(key)
    }

    fun fetchEvents(key: String) {
        viewModelScope.launch {
            _eventsList.postValue(Result.Loading())
            val data = getResult { service.getEvents(key) }
            _eventsList.postValue(data)
        }
    }
}