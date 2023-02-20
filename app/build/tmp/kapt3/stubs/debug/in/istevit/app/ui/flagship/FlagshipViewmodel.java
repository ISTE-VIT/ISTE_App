package in.istevit.app.ui.flagship;

import in.istevit.app.data.model.FlagshipModel;
import in.istevit.app.data.repository.flagship.FlagshipRepoImpl;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lin/istevit/app/ui/flagship/FlagshipViewmodel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lin/istevit/app/data/repository/flagship/FlagshipRepoImpl;", "(Lin/istevit/app/data/repository/flagship/FlagshipRepoImpl;)V", "flagshipList", "Landroidx/lifecycle/MutableLiveData;", "", "Lin/istevit/app/data/model/FlagshipModel;", "getFlagshipList", "()Landroidx/lifecycle/MutableLiveData;", "setFlagshipList", "(Landroidx/lifecycle/MutableLiveData;)V", "fetchFlagshipEvents", "", "app_debug"})
public final class FlagshipViewmodel extends androidx.lifecycle.ViewModel {
    private final in.istevit.app.data.repository.flagship.FlagshipRepoImpl repo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.FlagshipModel>> flagshipList;
    
    @javax.inject.Inject()
    public FlagshipViewmodel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.repository.flagship.FlagshipRepoImpl repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.FlagshipModel>> getFlagshipList() {
        return null;
    }
    
    public final void setFlagshipList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.FlagshipModel>> p0) {
    }
    
    public final void fetchFlagshipEvents() {
    }
}