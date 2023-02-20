package in.istevit.app.adapters;

import in.istevit.app.data.model.FlagshipModel;
import in.istevit.app.databinding.SingleFlagshipItemBinding;
import in.istevit.app.ui.flagship.FlagshipOnClickCallback;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"flagshipCallback", "", "v", "Landroid/widget/ImageView;", "callback", "Lin/istevit/app/ui/flagship/FlagshipOnClickCallback;", "flagshipData", "Lin/istevit/app/data/model/FlagshipModel;", "loadFlagshipImage", "item_imageView", "url", "", "app_debug"})
public final class FlagshipAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"loadFlagshipImage"})
    public static final void loadFlagshipImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView item_imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"flagshipCallback", "flagshipData"})
    public static final void flagshipCallback(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView v, @org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.flagship.FlagshipOnClickCallback callback, @org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.FlagshipModel flagshipData) {
    }
}