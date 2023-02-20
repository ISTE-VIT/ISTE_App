package `in`.istevit.app.ui.announcements

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
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
    @ApplicationContext context: Context,
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
        val ai: ApplicationInfo = context.packageManager
            .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        val value = ai.metaData["API_KEY"]
        val key = value.toString()
        fetchAnnouncements(key)
        fetchCarouselData(key)
    }

    fun fetchAnnouncements(key: String) {
        viewModelScope.launch {
            _announcementsList.postValue(Result.Loading())
            val result = getResult { service.getAnnouncements(key) }
            _announcementsList.postValue(result)
        }
    }

    fun fetchCarouselData(key: String) {
        viewModelScope.launch {
            _carouselList.postValue(Result.Loading())
            val result = getResult { service.getCarousel(key) }
            _carouselList.postValue(result)
        }
    }
}