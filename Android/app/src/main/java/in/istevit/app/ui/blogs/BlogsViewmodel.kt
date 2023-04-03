package `in`.istevit.app.ui.blogs

import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.BlogDetailsModel
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
class BlogsViewModel @Inject constructor(
    private val service: CommonNetworkService
) : ViewModel() {
    private val _blogsList: MutableLiveData<Result<List<BlogDetailsModel>>> = MutableLiveData()
    val blogsList: LiveData<Result<List<BlogDetailsModel>>>
        get() = _blogsList

    init {
        fetchBlogs()
    }

    fun fetchBlogs() {
        viewModelScope.launch {
            _blogsList.postValue(Result.Loading())
            val result = getResult { service.getBlogs() }
            _blogsList.postValue(result)
        }
    }
}