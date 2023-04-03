package `in`.istevit.app.ui.announcements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.istevit.app.data.model.home.HomeAnnouncementsData
import `in`.istevit.app.data.model.home.HomeCarouselData
import `in`.istevit.app.data.network.service.CommonNetworkService
import `in`.istevit.app.util.Result
import `in`.istevit.app.util.getResult
import kotlinx.coroutines.launch
import javax.inject.Inject

const val TAG = "AnnouncementsViewModel"

@HiltViewModel
class AnnouncementsViewModel @Inject constructor(
    private val service: CommonNetworkService
) : ViewModel() {
    private val _announcementsList: MutableLiveData<Result<List<HomeAnnouncementsData>>> =
        MutableLiveData()
    val announcementsList: LiveData<Result<List<HomeAnnouncementsData>>>
        get() = _announcementsList

    private val _carouselList: MutableLiveData<Result<List<HomeCarouselData>>> =
        MutableLiveData()
    val carouselList: LiveData<Result<List<HomeCarouselData>>>
        get() = _carouselList

    init {
        fetchAnnouncements()
        fetchCarouselData()
    }

    fun fetchAnnouncements() {
        viewModelScope.launch {
            _announcementsList.postValue(Result.Loading())
            val result = getResult { service.getAnnouncements() }
            _announcementsList.postValue(result)
        }
    }

    fun fetchCarouselData() {
        viewModelScope.launch {
            _carouselList.postValue(Result.Loading())
            val result = getResult { service.getCarousel() }
            _carouselList.postValue(result)
        }
    }
}