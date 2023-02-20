package in.istevit.app.data.repository.gallery;

import in.istevit.app.data.database.ImagesDao;
import in.istevit.app.data.network.service.CommonNetworkService;
import android.util.Log;
import java.net.UnknownHostException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lin/istevit/app/data/repository/gallery/GalleryRepoImpl;", "", "dao", "Lin/istevit/app/data/database/ImagesDao;", "service", "Lin/istevit/app/data/network/service/CommonNetworkService;", "(Lin/istevit/app/data/database/ImagesDao;Lin/istevit/app/data/network/service/CommonNetworkService;)V", "fetchGalleryData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGalleryData", "Landroidx/lifecycle/LiveData;", "", "Lin/istevit/app/data/model/GalleryModel;", "app_debug"})
public final class GalleryRepoImpl {
    private final in.istevit.app.data.database.ImagesDao dao = null;
    private final in.istevit.app.data.network.service.CommonNetworkService service = null;
    
    @javax.inject.Inject()
    public GalleryRepoImpl(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.database.ImagesDao dao, @org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchGalleryData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.istevit.app.data.model.GalleryModel>> getGalleryData() {
        return null;
    }
}