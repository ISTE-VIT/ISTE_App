package `in`.istevit.app.ui.gallery

import `in`.istevit.app.data.model.GalleryModel
import `in`.istevit.app.data.repository.gallery.GalleryRepoImpl
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class GalleryViewmodel: ViewModel() {
    private val repo: GalleryRepoImpl = GalleryRepoImpl()
    var galleryList = MutableLiveData<List<GalleryModel>>()

    fun fetchGallery(){
        viewModelScope.launch {
            val temp = repo.fetchGalleryData()
            if(temp.isSuccess) {
                galleryList.postValue(temp.getOrNull())
            }
        }
    }
}