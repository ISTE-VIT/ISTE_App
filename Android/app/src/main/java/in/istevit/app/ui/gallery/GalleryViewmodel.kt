package `in`.istevit.app.ui.gallery

import `in`.istevit.app.data.model.GalleryModel
import `in`.istevit.app.data.repository.gallery.GalleryRepoImpl
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GalleryViewmodel @Inject constructor(
    private val repo: GalleryRepoImpl,
) : ViewModel() {
    var galleryData: LiveData<List<GalleryModel>> = repo.getGalleryData()

    init {
        fetchGallery()
    }

    private fun fetchGallery() {
        viewModelScope.launch { repo.fetchGalleryData() }
    }
}