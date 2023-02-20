package in.istevit.app.ui.blogs;

import in.istevit.app.R;
import in.istevit.app.adapters.BlogsAdapter;
import in.istevit.app.data.model.BlogDetailsModel;
import in.istevit.app.databinding.FragmentBlogBinding;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lin/istevit/app/ui/blogs/BlogFragment;", "Landroidx/fragment/app/Fragment;", "Lin/istevit/app/ui/blogs/BlogOnCLickCallback;", "()V", "binding", "Lin/istevit/app/databinding/FragmentBlogBinding;", "getBinding", "()Lin/istevit/app/databinding/FragmentBlogBinding;", "setBinding", "(Lin/istevit/app/databinding/FragmentBlogBinding;)V", "blogAdapter", "Lin/istevit/app/adapters/BlogsAdapter;", "blogLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getBlogLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setBlogLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "blogsList", "", "Lin/istevit/app/data/model/BlogDetailsModel;", "getBlogsList", "()Ljava/util/List;", "setBlogsList", "(Ljava/util/List;)V", "chId", "", "viewmodel", "Lin/istevit/app/ui/blogs/BlogsViewmodel;", "getViewmodel", "()Lin/istevit/app/ui/blogs/BlogsViewmodel;", "setViewmodel", "(Lin/istevit/app/ui/blogs/BlogsViewmodel;)V", "onClick", "", "item", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"})
public final class BlogFragment extends androidx.fragment.app.Fragment implements in.istevit.app.ui.blogs.BlogOnCLickCallback {
    public in.istevit.app.databinding.FragmentBlogBinding binding;
    public in.istevit.app.ui.blogs.BlogsViewmodel viewmodel;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<in.istevit.app.data.model.BlogDetailsModel> blogsList;
    private in.istevit.app.adapters.BlogsAdapter blogAdapter;
    public androidx.recyclerview.widget.LinearLayoutManager blogLayoutManager;
    private int chId = 1;
    
    public BlogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.FragmentBlogBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.FragmentBlogBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.ui.blogs.BlogsViewmodel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.blogs.BlogsViewmodel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<in.istevit.app.data.model.BlogDetailsModel> getBlogsList() {
        return null;
    }
    
    public final void setBlogsList(@org.jetbrains.annotations.NotNull()
    java.util.List<in.istevit.app.data.model.BlogDetailsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getBlogLayoutManager() {
        return null;
    }
    
    public final void setBlogLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.BlogDetailsModel item) {
    }
}