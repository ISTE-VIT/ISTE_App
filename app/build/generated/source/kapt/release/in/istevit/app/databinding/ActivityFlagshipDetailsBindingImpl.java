package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFlagshipDetailsBindingImpl extends ActivityFlagshipDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 4);
        sViewsWithIds.put(R.id.imageView3, 5);
        sViewsWithIds.put(R.id.tracks_recView, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFlagshipDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityFlagshipDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.textView10.setTag(null);
        this.textView9.setTag(null);
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
        if (BR.flagshipDetailsItem == variableId) {
            setFlagshipDetailsItem((in.istevit.app.data.model.FlagshipModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFlagshipDetailsItem(@Nullable in.istevit.app.data.model.FlagshipModel FlagshipDetailsItem) {
        this.mFlagshipDetailsItem = FlagshipDetailsItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.flagshipDetailsItem);
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
        in.istevit.app.data.model.FlagshipModel flagshipDetailsItem = mFlagshipDetailsItem;
        java.lang.String flagshipDetailsItemEventName = null;
        java.lang.String flagshipDetailsItemEventNameJavaLangStringTracks = null;
        java.lang.String flagshipDetailsItemDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (flagshipDetailsItem != null) {
                    // read flagshipDetailsItem.eventName
                    flagshipDetailsItemEventName = flagshipDetailsItem.getEventName();
                    // read flagshipDetailsItem.description
                    flagshipDetailsItemDescription = flagshipDetailsItem.getDescription();
                }


                // read (flagshipDetailsItem.eventName) + (" Tracks")
                flagshipDetailsItemEventNameJavaLangStringTracks = (flagshipDetailsItemEventName) + (" Tracks");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, flagshipDetailsItemEventName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView10, flagshipDetailsItemEventNameJavaLangStringTracks);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView9, flagshipDetailsItemDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): flagshipDetailsItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}