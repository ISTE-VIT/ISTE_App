package in.istevit.app.ui.projects;

import in.istevit.app.adapters.ProjectsAdapter;
import in.istevit.app.data.model.ProjectsModel;
import in.istevit.app.databinding.ActivityProjectsBinding;
import in.istevit.app.ui.WebviewActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lin/istevit/app/ui/projects/ProjectsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lin/istevit/app/ui/projects/ProjectOnClickCallback;", "()V", "adapter", "Lin/istevit/app/adapters/ProjectsAdapter;", "getAdapter", "()Lin/istevit/app/adapters/ProjectsAdapter;", "setAdapter", "(Lin/istevit/app/adapters/ProjectsAdapter;)V", "binding", "Lin/istevit/app/databinding/ActivityProjectsBinding;", "getBinding", "()Lin/istevit/app/databinding/ActivityProjectsBinding;", "setBinding", "(Lin/istevit/app/databinding/ActivityProjectsBinding;)V", "viewmodel", "Lin/istevit/app/ui/projects/ProjectsViewmodel;", "getViewmodel", "()Lin/istevit/app/ui/projects/ProjectsViewmodel;", "setViewmodel", "(Lin/istevit/app/ui/projects/ProjectsViewmodel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onProjectClick", "item", "Lin/istevit/app/data/model/ProjectsModel;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProjectsActivity extends androidx.appcompat.app.AppCompatActivity implements in.istevit.app.ui.projects.ProjectOnClickCallback {
    public in.istevit.app.databinding.ActivityProjectsBinding binding;
    public in.istevit.app.adapters.ProjectsAdapter adapter;
    public in.istevit.app.ui.projects.ProjectsViewmodel viewmodel;
    
    public ProjectsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.ActivityProjectsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.ActivityProjectsBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.adapters.ProjectsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    in.istevit.app.adapters.ProjectsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.ui.projects.ProjectsViewmodel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.projects.ProjectsViewmodel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onProjectClick(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.ProjectsModel item) {
    }
}