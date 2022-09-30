package `in`.istevit.app.ui.flagship

import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.data.repository.flagship.FlagshipRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class FlagshipViewmodel: ViewModel() {
    private val repo: FlagshipRepoImpl = FlagshipRepoImpl()
    var flagshipList = MutableLiveData<List<FlagshipModel>>()

    fun fetchFlagshipEvents(){
        viewModelScope.launch {
            val temp = repo.fetchFlagshipData()
            if(temp.isSuccess) {
                flagshipList.postValue(temp.getOrNull())
            }
        }
    }
}