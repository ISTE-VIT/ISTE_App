package in.istevit.app.ui.announcements;

import in.istevit.app.adapters.AnnouncementsAdapter;
import in.istevit.app.adapters.CarouselAdapter;
import in.istevit.app.data.model.home.HomeCarouselData;
import in.istevit.app.databinding.FragmentAnnouncementsBinding;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0006\u0010.\u001a\u00020#J\u0006\u0010/\u001a\u00020#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00060"}, d2 = {"Lin/istevit/app/ui/announcements/AnnouncementsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "announcementsAdapter", "Lin/istevit/app/adapters/AnnouncementsAdapter;", "announcementsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "announcementsLoaded", "", "binding", "Lin/istevit/app/databinding/FragmentAnnouncementsBinding;", "getBinding", "()Lin/istevit/app/databinding/FragmentAnnouncementsBinding;", "setBinding", "(Lin/istevit/app/databinding/FragmentAnnouncementsBinding;)V", "carouselAdapter", "Lin/istevit/app/adapters/CarouselAdapter;", "carouselLayoutManager", "carouselList", "", "Lin/istevit/app/data/model/home/HomeCarouselData;", "carouselLoaded", "position", "", "timer", "Ljava/util/Timer;", "timerTask", "Ljava/util/TimerTask;", "viewModel", "Lin/istevit/app/ui/announcements/AnnouncementsViewModel;", "getViewModel", "()Lin/istevit/app/ui/announcements/AnnouncementsViewModel;", "setViewModel", "(Lin/istevit/app/ui/announcements/AnnouncementsViewModel;)V", "isAnnouncementsLoaded", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "runAutoScrollingCarousel", "stopAutoScrollCarousel", "app_debug"})
public final class AnnouncementsFragment extends androidx.fragment.app.Fragment {
    public in.istevit.app.databinding.FragmentAnnouncementsBinding binding;
    private in.istevit.app.adapters.CarouselAdapter carouselAdapter;
    private in.istevit.app.adapters.AnnouncementsAdapter announcementsAdapter;
    private java.util.List<in.istevit.app.data.model.home.HomeCarouselData> carouselList;
    public in.istevit.app.ui.announcements.AnnouncementsViewModel viewModel;
    private androidx.recyclerview.widget.LinearLayoutManager carouselLayoutManager;
    private androidx.recyclerview.widget.LinearLayoutManager announcementsLayoutManager;
    private java.util.Timer timer;
    private java.util.TimerTask timerTask;
    private int position = 0;
    private boolean announcementsLoaded = false;
    private boolean carouselLoaded = false;
    
    public AnnouncementsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.FragmentAnnouncementsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.FragmentAnnouncementsBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.ui.announcements.AnnouncementsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.ui.announcements.AnnouncementsViewModel p0) {
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
    
    public final void runAutoScrollingCarousel() {
    }
    
    public final void stopAutoScrollCarousel() {
    }
    
    private final void isAnnouncementsLoaded() {
    }
}