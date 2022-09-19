package `in`.istevit.app.ui.blogs

import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.data.repository.blogs.BlogsRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BlogsViewmodel: ViewModel() {
    private val repo: BlogsRepoImpl = BlogsRepoImpl()
    var blogsList = MutableLiveData<List<BlogDetailsModel>>()

    fun fetchBlogs(){
        viewModelScope.launch {
            val temp = repo.fetchEventsData()
            if(temp.isSuccess) {
                blogsList.postValue(temp.getOrNull())
            }
        }
    }
}