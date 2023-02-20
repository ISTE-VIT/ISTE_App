package `in`.istevit.app.ui.blogs

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.lifecycle.LiveData
import `in`.istevit.app.data.model.BlogDetailsModel
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
class BlogsViewModel @Inject constructor(
    @ApplicationContext context: Context,
    private val service: CommonNetworkService
) : ViewModel() {
    private val _blogsList: MutableLiveData<Result<List<BlogDetailsModel>>> = MutableLiveData()
    val blogsList: LiveData<Result<List<BlogDetailsModel>>>
        get() = _blogsList

    init {
        val ai: ApplicationInfo = context.packageManager
            .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        val value = ai.metaData["API_KEY"]
        val key = value.toString()
        fetchBlogs(key)
    }

    fun fetchBlogs(key: String) {
        viewModelScope.launch {
            _blogsList.postValue(Result.Loading())
            val result = getResult { service.getBlogs(key) }
            _blogsList.postValue(result)
        }
    }
}