package in.istevit.app.adapters;

import in.istevit.app.data.model.ProjectsModel;
import in.istevit.app.databinding.SingleProjectItemBinding;
import in.istevit.app.ui.projects.ProjectOnClickCallback;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"loadProjectImage", "", "item_imageView", "Landroid/widget/ImageView;", "url", "", "projectsCallback", "v", "callback", "Lin/istevit/app/ui/projects/ProjectOnClickCallback;", "projectsData", "Lin/istevit/app/data/model/ProjectsModel;", "app_debug"})
public final class ProjectsAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"loadProjectImage"})
    public static final void loadProjectImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView item_imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"projectsCallback", "projectsData"})
    public static final void projectsCallback(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView v, @org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.projects.ProjectOnClickCallback callback, @org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.ProjectsModel projectsData) {
    }
}