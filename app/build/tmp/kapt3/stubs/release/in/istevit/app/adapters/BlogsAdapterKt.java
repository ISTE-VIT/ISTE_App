package in.istevit.app.adapters;

import in.istevit.app.data.model.BlogDetailsModel;
import in.istevit.app.databinding.SingleBlogsItemBinding;
import in.istevit.app.ui.blogs.BlogOnCLickCallback;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"blogsCallback", "", "v", "Landroid/widget/Button;", "callback", "Lin/istevit/app/ui/blogs/BlogOnCLickCallback;", "blogsData", "Lin/istevit/app/data/model/BlogDetailsModel;", "loadBlogsImage", "item_imageView", "Landroid/widget/ImageView;", "url", "", "app_release"})
public final class BlogsAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"loadBlogsImage"})
    public static final void loadBlogsImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView item_imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"blogsCallback", "blogsData"})
    public static final void blogsCallback(@org.jetbrains.annotations.NotNull()
    android.widget.Button v, @org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.blogs.BlogOnCLickCallback callback, @org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.BlogDetailsModel blogsData) {
    }
}