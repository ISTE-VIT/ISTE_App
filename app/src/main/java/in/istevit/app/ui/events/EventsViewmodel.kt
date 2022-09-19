package `in`.istevit.app.ui.events

import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.data.repository.events.EventsRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class EventsViewmodel: ViewModel() {
    private val repo: EventsRepoImpl = EventsRepoImpl()
    var eventsList = MutableLiveData<List<EventDetailsModel>>()

    fun fetchEvents(){
        viewModelScope.launch {
            val temp = repo.fetchEventsData()
            if(temp.isSuccess) {
                eventsList.postValue(temp.getOrNull())
            }
        }
    }
}