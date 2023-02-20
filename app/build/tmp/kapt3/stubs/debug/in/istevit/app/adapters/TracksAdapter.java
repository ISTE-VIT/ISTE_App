package in.istevit.app.adapters;

import in.istevit.app.databinding.SingleTracksItemBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lin/istevit/app/adapters/TracksAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lin/istevit/app/adapters/TracksAdapter$ItemViewHolder;", "tracks", "", "", "(Ljava/util/List;)V", "getTracks", "()Ljava/util/List;", "setTracks", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_debug"})
public final class TracksAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<in.istevit.app.adapters.TracksAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> tracks;
    
    public TracksAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tracks) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTracks() {
        return null;
    }
    
    public final void setTracks(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public in.istevit.app.adapters.TracksAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    in.istevit.app.adapters.TracksAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lin/istevit/app/adapters/TracksAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lin/istevit/app/databinding/SingleTracksItemBinding;", "(Lin/istevit/app/adapters/TracksAdapter;Lin/istevit/app/databinding/SingleTracksItemBinding;)V", "getBinding", "()Lin/istevit/app/databinding/SingleTracksItemBinding;", "app_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final in.istevit.app.databinding.SingleTracksItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        in.istevit.app.databinding.SingleTracksItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final in.istevit.app.databinding.SingleTracksItemBinding getBinding() {
            return null;
        }
    }
}