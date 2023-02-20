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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lin/istevit/app/adapters/CarouselAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lin/istevit/app/data/model/home/HomeCarouselData;", "Lin/istevit/app/adapters/CarouselAdapter$ItemViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffUtil", "ItemViewHolder", "app_release"})
public final class CarouselAdapter extends androidx.recyclerview.widget.ListAdapter<in.istevit.app.data.model.home.HomeCarouselData, in.istevit.app.adapters.CarouselAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public CarouselAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public in.istevit.app.adapters.CarouselAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    in.istevit.app.adapters.CarouselAdapter.ItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lin/istevit/app/adapters/CarouselAdapter$DiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lin/istevit/app/data/model/home/HomeCarouselData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_release"})
    public static final class DiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<in.istevit.app.data.model.home.HomeCarouselData> {
        
        public DiffUtil() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        in.istevit.app.data.model.home.HomeCarouselData oldItem, @org.jetbrains.annotations.NotNull()
        in.istevit.app.data.model.home.HomeCarouselData newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        in.istevit.app.data.model.home.HomeCarouselData oldItem, @org.jetbrains.annotations.NotNull()
        in.istevit.app.data.model.home.HomeCarouselData newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lin/istevit/app/adapters/CarouselAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lin/istevit/app/databinding/SingleCarouselItemBinding;", "(Lin/istevit/app/adapters/CarouselAdapter;Lin/istevit/app/databinding/SingleCarouselItemBinding;)V", "bind", "", "item", "Lin/istevit/app/data/model/home/HomeCarouselData;", "app_release"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final in.istevit.app.databinding.SingleCarouselItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        in.istevit.app.databinding.SingleCarouselItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        in.istevit.app.data.model.home.HomeCarouselData item) {
        }
    }
}