package `in`.istevit.app.ui.flagship

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.FlagshipModel
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
class FlagshipViewmodel @Inject constructor(
    @ApplicationContext context: Context,
    private val service: CommonNetworkService
) :
    ViewModel() {
    private val _flagshipList = MutableLiveData<Result<List<FlagshipModel>>>()
    val flagshipList: LiveData<Result<List<FlagshipModel>>>
        get() = _flagshipList

    init {
        val ai: ApplicationInfo = context.packageManager
            .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        val value = ai.metaData["API_KEY"]
        val key = value.toString()
        fetchFlagshipEvents(key)
    }

    fun fetchFlagshipEvents(key: String) {
        viewModelScope.launch {
            _flagshipList.postValue(Result.Loading())
            val data = getResult { service.getFlagshipEvents(key) }
            _flagshipList.postValue(data)
        }
    }
}