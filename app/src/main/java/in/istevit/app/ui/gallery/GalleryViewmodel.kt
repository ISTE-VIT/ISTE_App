package `in`.istevit.app.ui.gallery

import `in`.istevit.app.data.model.GalleryModel
import `in`.istevit.app.data.repository.gallery.GalleryRepoImpl
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GalleryViewmodel @Inject constructor(private val repo: GalleryRepoImpl): ViewModel() {
    suspend fun fetchGallery(): LiveData<List<GalleryModel>>{
        return repo.fetchGalleryData()
    }
}