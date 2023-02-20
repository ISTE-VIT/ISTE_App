package in.istevit.app.ui.resources;

import in.istevit.app.adapters.ResourcesDetailsAdapter;
import in.istevit.app.data.model.resources.ResourcesDetailModel;
import in.istevit.app.databinding.ActivityResourcesDetailBinding;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.viven.imagezoom.ImageZoomHelper;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lin/istevit/app/ui/resources/ResourcesDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lin/istevit/app/adapters/ResourcesDetailsAdapter;", "binding", "Lin/istevit/app/databinding/ActivityResourcesDetailBinding;", "getBinding", "()Lin/istevit/app/databinding/ActivityResourcesDetailBinding;", "setBinding", "(Lin/istevit/app/databinding/ActivityResourcesDetailBinding;)V", "imageZoomHelper", "Lcom/viven/imagezoom/ImageZoomHelper;", "ogpViewModel", "Lin/istevit/app/ui/resources/OgpViewModel;", "resData", "Lin/istevit/app/data/model/resources/ResourcesDetailModel;", "resViewModel", "Lin/istevit/app/ui/resources/ResourcesViewModel;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ResourcesDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    public in.istevit.app.databinding.ActivityResourcesDetailBinding binding;
    private in.istevit.app.data.model.resources.ResourcesDetailModel resData;
    private in.istevit.app.ui.resources.OgpViewModel ogpViewModel;
    private in.istevit.app.ui.resources.ResourcesViewModel resViewModel;
    private in.istevit.app.adapters.ResourcesDetailsAdapter adapter;
    private com.viven.imagezoom.ImageZoomHelper imageZoomHelper;
    
    public ResourcesDetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.ActivityResourcesDetailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.ActivityResourcesDetailBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
}