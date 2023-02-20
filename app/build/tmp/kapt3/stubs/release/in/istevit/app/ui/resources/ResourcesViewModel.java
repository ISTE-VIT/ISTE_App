package in.istevit.app.ui.resources;

import in.istevit.app.data.model.resources.ResourcesDetailModel;
import in.istevit.app.data.repository.ResourcesRepoImpl;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lin/istevit/app/ui/resources/ResourcesViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lin/istevit/app/data/repository/ResourcesRepoImpl;", "(Lin/istevit/app/data/repository/ResourcesRepoImpl;)V", "resourcesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lin/istevit/app/data/model/resources/ResourcesDetailModel;", "getResourcesList", "()Landroidx/lifecycle/MutableLiveData;", "setResourcesList", "(Landroidx/lifecycle/MutableLiveData;)V", "getResources", "", "topic", "", "app_release"})
public final class ResourcesViewModel extends androidx.lifecycle.ViewModel {
    private final in.istevit.app.data.repository.ResourcesRepoImpl repo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.resources.ResourcesDetailModel>> resourcesList;
    
    @javax.inject.Inject()
    public ResourcesViewModel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.repository.ResourcesRepoImpl repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.resources.ResourcesDetailModel>> getResourcesList() {
        return null;
    }
    
    public final void setResourcesList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.resources.ResourcesDetailModel>> p0) {
    }
    
    public final void getResources(@org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
    }
}