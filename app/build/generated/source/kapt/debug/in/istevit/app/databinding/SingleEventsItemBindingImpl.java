package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleEventsItemBindingImpl extends SingleEventsItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView7, 7);
        sViewsWithIds.put(R.id.timeTV, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleEventsItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private SingleEventsItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            );
        this.imageView2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
        this.textView8.setTag(null);
        this.timeText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.callback == variableId) {
            setCallback((in.istevit.app.ui.events.EventOnClickCallback) variable);
        }
        else if (BR.event == variableId) {
            setEvent((in.istevit.app.data.model.EventDetailsModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback(@Nullable in.istevit.app.ui.events.EventOnClickCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setEvent(@Nullable in.istevit.app.data.model.EventDetailsModel Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        java.lang.String javaLangStringByEventSpeaker = null;
        java.lang.String eventTime = null;
        java.lang.String eventTitle = null;
        java.lang.String eventDate = null;
        java.lang.String eventSpeaker = null;
        in.istevit.app.ui.events.EventOnClickCallback callback = mCallback;
        java.lang.String eventImage = null;
        in.istevit.app.data.model.EventDetailsModel event = mEvent;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (event != null) {
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


                    // read ("by ") + (event.speaker)
                    javaLangStringByEventSpeaker = ("by ") + (eventSpeaker);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            in.istevit.app.adapters.EventsAdapterKt.loadEventsImage(this.imageView2, eventImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, eventTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, javaLangStringByEventSpeaker);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, eventDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timeText, eventTime);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            in.istevit.app.adapters.EventsAdapterKt.eventsCallback(this.mboundView6, callback, event);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callback
        flag 1 (0x2L): event
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}