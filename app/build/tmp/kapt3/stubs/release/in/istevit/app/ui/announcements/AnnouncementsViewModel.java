package in.istevit.app.ui.announcements;

import in.istevit.app.data.model.home.HomeAnnouncementsData;
import in.istevit.app.data.model.home.HomeCarouselData;
import in.istevit.app.data.repository.home.HomeRepoImpl;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lin/istevit/app/ui/announcements/AnnouncementsViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lin/istevit/app/data/repository/home/HomeRepoImpl;", "(Lin/istevit/app/data/repository/home/HomeRepoImpl;)V", "announcementsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lin/istevit/app/data/model/home/HomeAnnouncementsData;", "getAnnouncementsList", "()Landroidx/lifecycle/MutableLiveData;", "setAnnouncementsList", "(Landroidx/lifecycle/MutableLiveData;)V", "carouselList", "Lin/istevit/app/data/model/home/HomeCarouselData;", "getCarouselList", "setCarouselList", "fetchAnnouncements", "", "fetchCarouselData", "app_release"})
public final class AnnouncementsViewModel extends androidx.lifecycle.ViewModel {
    private final in.istevit.app.data.repository.home.HomeRepoImpl repo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.home.HomeAnnouncementsData>> announcementsList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.home.HomeCarouselData>> carouselList;
    
    @javax.inject.Inject()
    public AnnouncementsViewModel(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.repository.home.HomeRepoImpl repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.home.HomeAnnouncementsData>> getAnnouncementsList() {
        return null;
    }
    
    public final void setAnnouncementsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.home.HomeAnnouncementsData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.home.HomeCarouselData>> getCarouselList() {
        return null;
    }
    
    public final void setCarouselList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<in.istevit.app.data.model.home.HomeCarouselData>> p0) {
    }
    
    public final void fetchAnnouncements() {
    }
    
    public final void fetchCarouselData() {
    }
}