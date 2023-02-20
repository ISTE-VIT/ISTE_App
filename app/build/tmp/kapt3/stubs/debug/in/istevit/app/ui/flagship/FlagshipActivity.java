package in.istevit.app.ui.flagship;

import in.istevit.app.adapters.FlagshipAdapter;
import in.istevit.app.data.model.FlagshipModel;
import in.istevit.app.databinding.ActivityFlagshipBinding;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lin/istevit/app/ui/flagship/FlagshipActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lin/istevit/app/ui/flagship/FlagshipOnClickCallback;", "()V", "adapter", "Lin/istevit/app/adapters/FlagshipAdapter;", "binding", "Lin/istevit/app/databinding/ActivityFlagshipBinding;", "getBinding", "()Lin/istevit/app/databinding/ActivityFlagshipBinding;", "setBinding", "(Lin/istevit/app/databinding/ActivityFlagshipBinding;)V", "viewmodel", "Lin/istevit/app/ui/flagship/FlagshipViewmodel;", "getViewmodel", "()Lin/istevit/app/ui/flagship/FlagshipViewmodel;", "setViewmodel", "(Lin/istevit/app/ui/flagship/FlagshipViewmodel;)V", "onClick", "", "item", "Lin/istevit/app/data/model/FlagshipModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FlagshipActivity extends androidx.appcompat.app.AppCompatActivity implements in.istevit.app.ui.flagship.FlagshipOnClickCallback {
    public in.istevit.app.databinding.ActivityFlagshipBinding binding;
    private in.istevit.app.adapters.FlagshipAdapter adapter;
    public in.istevit.app.ui.flagship.FlagshipViewmodel viewmodel;
    
    public FlagshipActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.ActivityFlagshipBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.ActivityFlagshipBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.ui.flagship.FlagshipViewmodel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.flagship.FlagshipViewmodel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.FlagshipModel item) {
    }
}