package in.istevit.app.ui.events;

import in.istevit.app.R;
import in.istevit.app.data.model.EventDetailsModel;
import in.istevit.app.databinding.ActivityEventDetailsBinding;
import android.app.*;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lin/istevit/app/ui/events/EventDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lin/istevit/app/databinding/ActivityEventDetailsBinding;", "getBinding", "()Lin/istevit/app/databinding/ActivityEventDetailsBinding;", "setBinding", "(Lin/istevit/app/databinding/ActivityEventDetailsBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "Companion", "app_release"})
public final class EventDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    public in.istevit.app.databinding.ActivityEventDetailsBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final in.istevit.app.ui.events.EventDetailsActivity.Companion Companion = null;
    
    public EventDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.ActivityEventDetailsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.ActivityEventDetailsBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"loadEventImage"})
    public static final void loadEventImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lin/istevit/app/ui/events/EventDetailsActivity$Companion;", "", "()V", "loadEventImage", "", "view", "Landroid/widget/ImageView;", "url", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"loadEventImage"})
        public final void loadEventImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
    }
}