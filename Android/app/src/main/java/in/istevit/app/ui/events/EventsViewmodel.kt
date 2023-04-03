package `in`.istevit.app.ui.events

import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.EventDetailsModel
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
class EventsViewmodel @Inject constructor(
    private val service: CommonNetworkService
) : ViewModel() {
    private val _eventsList = MutableLiveData<Result<List<EventDetailsModel>>>()
    val eventsList: LiveData<Result<List<EventDetailsModel>>>
        get() = _eventsList

    init {
        fetchEvents()
    }

    fun fetchEvents() {
        viewModelScope.launch {
            _eventsList.postValue(Result.Loading())
            val data = getResult { service.getEvents() }
            _eventsList.postValue(data)
        }
    }
}