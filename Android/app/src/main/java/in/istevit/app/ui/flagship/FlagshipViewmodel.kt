package `in`.istevit.app.ui.flagship

import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.FlagshipModel
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
class FlagshipViewmodel @Inject constructor(
    private val service: CommonNetworkService
) :
    ViewModel() {
    private val _flagshipList = MutableLiveData<Result<List<FlagshipModel>>>()
    val flagshipList: LiveData<Result<List<FlagshipModel>>>
        get() = _flagshipList

    init {
        fetchFlagshipEvents()
    }

    fun fetchFlagshipEvents() {
        viewModelScope.launch {
            _flagshipList.postValue(Result.Loading())
            val data = getResult { service.getFlagshipEvents() }
            _flagshipList.postValue(data)
        }
    }
}