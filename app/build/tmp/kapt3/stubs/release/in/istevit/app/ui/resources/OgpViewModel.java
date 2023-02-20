package in.istevit.app.ui.resources;

import in.istevit.app.data.model.resources.OpenGraphResult;
import in.istevit.app.data.model.resources.ResourcesDetailModel;
import in.istevit.app.data.model.resources.ResourcesOgpData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import org.jsoup.Jsoup;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lin/istevit/app/ui/resources/OgpViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "ogpLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lin/istevit/app/data/model/resources/ResourcesOgpData;", "getOgpLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setOgpLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "resLinks", "", "Lin/istevit/app/data/model/resources/OpenGraphResult;", "resTopics", "fetchOgpData", "", "resData", "Lin/istevit/app/data/model/resources/ResourcesDetailModel;", "app_release"})
public final class OgpViewModel extends androidx.lifecycle.ViewModel {
    private java.util.List<in.istevit.app.data.model.resources.OpenGraphResult> resLinks;
    private java.util.List<in.istevit.app.data.model.resources.ResourcesOgpData> resTopics;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.resources.ResourcesOgpData>> ogpLiveData;
    
    public OgpViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.resources.ResourcesOgpData>> getOgpLiveData() {
        return null;
    }
    
    public final void setOgpLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.resources.ResourcesOgpData>> p0) {
    }
    
    public final void fetchOgpData(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.resources.ResourcesDetailModel resData) {
    }
}