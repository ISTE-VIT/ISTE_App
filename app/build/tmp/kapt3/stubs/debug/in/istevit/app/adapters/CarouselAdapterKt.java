package in.istevit.app.adapters;

import in.istevit.app.data.model.home.HomeCarouselData;
import in.istevit.app.databinding.SingleCarouselItemBinding;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0006"}, d2 = {"loadCarouselImage", "", "item_imageView", "Landroid/widget/ImageView;", "url", "", "app_debug"})
public final class CarouselAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"loadCarouselImage"})
    public static final void loadCarouselImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView item_imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
}