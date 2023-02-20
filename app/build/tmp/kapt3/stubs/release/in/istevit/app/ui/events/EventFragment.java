package in.istevit.app.ui.events;

import in.istevit.app.R;
import in.istevit.app.adapters.EventsAdapter;
import in.istevit.app.data.model.EventDetailsModel;
import in.istevit.app.databinding.FragmentEventBinding;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.chip.Chip;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lin/istevit/app/ui/events/EventFragment;", "Landroidx/fragment/app/Fragment;", "Lin/istevit/app/ui/events/EventOnClickCallback;", "()V", "binding", "Lin/istevit/app/databinding/FragmentEventBinding;", "getBinding", "()Lin/istevit/app/databinding/FragmentEventBinding;", "setBinding", "(Lin/istevit/app/databinding/FragmentEventBinding;)V", "chId", "", "eventAdapter", "Lin/istevit/app/adapters/EventsAdapter;", "eventLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getEventLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setEventLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "eventsList", "", "Lin/istevit/app/data/model/EventDetailsModel;", "getEventsList", "()Ljava/util/List;", "setEventsList", "(Ljava/util/List;)V", "viewmodel", "Lin/istevit/app/ui/events/EventsViewmodel;", "onClick", "", "item", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"})
public final class EventFragment extends androidx.fragment.app.Fragment implements in.istevit.app.ui.events.EventOnClickCallback {
    public in.istevit.app.databinding.FragmentEventBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<in.istevit.app.data.model.EventDetailsModel> eventsList;
    private in.istevit.app.ui.events.EventsViewmodel viewmodel;
    private in.istevit.app.adapters.EventsAdapter eventAdapter;
    public androidx.recyclerview.widget.LinearLayoutManager eventLayoutManager;
    private int chId = 1;
    
    public EventFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.FragmentEventBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.FragmentEventBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<in.istevit.app.data.model.EventDetailsModel> getEventsList() {
        return null;
    }
    
    public final void setEventsList(@org.jetbrains.annotations.NotNull()
    java.util.List<in.istevit.app.data.model.EventDetailsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getEventLayoutManager() {
        return null;
    }
    
    public final void setEventLayoutManager(@org.jetbrains.annotations.NotNull()
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
    in.istevit.app.data.model.EventDetailsModel item) {
    }
}