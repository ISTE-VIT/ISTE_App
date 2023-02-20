package in.istevit.app.ui.gallery;

import in.istevit.app.data.database.ImagesDao;
import in.istevit.app.data.model.GalleryModel;
import in.istevit.app.data.repository.gallery.GalleryRepoImpl;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lin/istevit/app/ui/gallery/GalleryViewmodel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lin/istevit/app/data/repository/gallery/GalleryRepoImpl;", "dao", "Lin/istevit/app/data/database/ImagesDao;", "(Lin/istevit/app/data/repository/gallery/GalleryRepoImpl;Lin/istevit/app/data/database/ImagesDao;)V", "galleryData", "Landroidx/lifecycle/LiveData;", "", "Lin/istevit/app/data/model/GalleryModel;", "getGalleryData", "()Landroidx/lifecycle/LiveData;", "setGalleryData", "(Landroidx/lifecycle/LiveData;)V", "fetchGallery", "", "app_debug"})
public final class GalleryViewmodel extends androidx.lifecycle.ViewModel {
    private final in.istevit.app.data.repository.gallery.GalleryRepoImpl repo = null;
    private final in.istevit.app.data.database.ImagesDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<in.istevit.app.data.model.GalleryModel>> galleryData;
    
    @javax.inject.Inject()
    public GalleryViewmodel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.repository.gallery.GalleryRepoImpl repo, @org.jetbrains.annotations.NotNull()
    in.istevit.app.data.database.ImagesDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.istevit.app.data.model.GalleryModel>> getGalleryData() {
        return null;
    }
    
    public final void setGalleryData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<in.istevit.app.data.model.GalleryModel>> p0) {
    }
    
    private final void fetchGallery() {
    }
}