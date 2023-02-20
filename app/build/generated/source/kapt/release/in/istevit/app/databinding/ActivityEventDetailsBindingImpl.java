package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEventDetailsBindingImpl extends ActivityEventDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 8);
        sViewsWithIds.put(R.id.toolbar, 9);
        sViewsWithIds.put(R.id.details_difficulty, 10);
        sViewsWithIds.put(R.id.timeTitle, 11);
        sViewsWithIds.put(R.id.dateTitle, 12);
        sViewsWithIds.put(R.id.details_score, 13);
        sViewsWithIds.put(R.id.textView3, 14);
        sViewsWithIds.put(R.id.button, 15);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEventDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityEventDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[8]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (androidx.appcompat.widget.Toolbar) bindings[9]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[1]
            );
        this.dateTV.setTag(null);
        this.detailsTV.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.platformTV.setTag(null);
        this.speakerTV.setTag(null);
        this.timeTV.setTag(null);
        this.toolbarLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.event == variableId) {
            setEvent((in.istevit.app.data.model.EventDetailsModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEvent(@Nullable in.istevit.app.data.model.EventDetailsModel Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.event);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String eventPlatform = null;
        java.lang.String eventDescription = null;
        java.lang.String eventTime = null;
        java.lang.String eventTitle = null;
        java.lang.String eventDate = null;
        java.lang.String eventSpeaker = null;
        java.lang.String eventImage = null;
        in.istevit.app.data.model.EventDetailsModel event = mEvent;

        if ((dirtyFlags & 0x3L) != 0) {



                if (event != null) {
                    // read event.platform
                    eventPlatform = event.getPlatform();
                    // read event.description
                    eventDescription = event.getDescription();
                    // read event.time
                    eventTime = event.getTime();
                    // read event.title
                    eventTitle = event.getTitle();
                    // read event.date
                    eventDate = event.getDate();
                    // read event.speaker
                    eventSpeaker = event.getSpeaker();
                    // read event.image
                    eventImage = event.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateTV, eventDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailsTV, eventDescription);
            in.istevit.app.ui.events.EventDetailsActivity.loadEventImage(this.imageView, eventImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.platformTV, eventPlatform);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speakerTV, eventSpeaker);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timeTV, eventTime);
            this.toolbarLayout.setTitle(eventTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): event
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}