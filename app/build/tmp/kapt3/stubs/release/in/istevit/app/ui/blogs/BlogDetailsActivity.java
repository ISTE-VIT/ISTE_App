package in.istevit.app.ui.blogs;

import in.istevit.app.R;
import in.istevit.app.data.model.BlogDetailsModel;
import in.istevit.app.databinding.ActivityBlogDetailsBinding;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialog;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lin/istevit/app/ui/blogs/BlogDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lin/istevit/app/ui/blogs/ReadCallback;", "()V", "binding", "Lin/istevit/app/databinding/ActivityBlogDetailsBinding;", "getBinding", "()Lin/istevit/app/databinding/ActivityBlogDetailsBinding;", "setBinding", "(Lin/istevit/app/databinding/ActivityBlogDetailsBinding;)V", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getBottomSheetDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setBottomSheetDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRead", "link", "", "Companion", "app_release"})
public final class BlogDetailsActivity extends androidx.appcompat.app.AppCompatActivity implements in.istevit.app.ui.blogs.ReadCallback {
    public in.istevit.app.databinding.ActivityBlogDetailsBinding binding;
    public com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
    public android.view.View view;
    @org.jetbrains.annotations.NotNull()
    public static final in.istevit.app.ui.blogs.BlogDetailsActivity.Companion Companion = null;
    
    public BlogDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.ActivityBlogDetailsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.ActivityBlogDetailsBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetDialog getBottomSheetDialog() {
        return null;
    }
    
    public final void setBottomSheetDialog(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
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
    
    @java.lang.Override()
    public void onRead(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"loadImage"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setCallback", "blogData"})
    public static final void setCallback(@org.jetbrains.annotations.NotNull()
    android.widget.Button view, @org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.blogs.ReadCallback callback, @org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.BlogDetailsModel blog) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lin/istevit/app/ui/blogs/BlogDetailsActivity$Companion;", "", "()V", "loadImage", "", "view", "Landroid/widget/ImageView;", "url", "", "setCallback", "Landroid/widget/Button;", "callback", "Lin/istevit/app/ui/blogs/ReadCallback;", "blog", "Lin/istevit/app/data/model/BlogDetailsModel;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"loadImage"})
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"setCallback", "blogData"})
        public final void setCallback(@org.jetbrains.annotations.NotNull()
        android.widget.Button view, @org.jetbrains.annotations.NotNull()
        in.istevit.app.ui.blogs.ReadCallback callback, @org.jetbrains.annotations.NotNull()
        in.istevit.app.data.model.BlogDetailsModel blog) {
        }
    }
}