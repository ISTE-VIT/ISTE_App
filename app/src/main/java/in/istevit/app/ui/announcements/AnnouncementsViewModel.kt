package `in`.istevit.app.ui.announcements

import `in`.istevit.app.data.model.home.HomeAnnouncementsData
import `in`.istevit.app.data.model.home.HomeCarouselData
import `in`.istevit.app.data.repository.home.HomeRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

const val TAG = "AnnouncementsViewModel"

@HiltViewModel
class AnnouncementsViewModel @Inject constructor(private val repo: HomeRepoImpl): ViewModel() {
    var announcementsList = MutableLiveData<List<HomeAnnouncementsData>>()
    var carouselList = MutableLiveData<List<HomeCarouselData>>()

    fun fetchAnnouncements(){
        viewModelScope.launch {
            val temp = repo.fetchAnnouncementsData()
            if(temp.isSuccess) {
                announcementsList.postValue(temp.getOrNull())
            }
        }
    }

    fun fetchCarouselData(){
        viewModelScope.launch {
            val temp = repo.fetchCarouselData()
            if(temp.isSuccess) {
                carouselList.postValue(temp.getOrNull())
            }
        }
    }
}