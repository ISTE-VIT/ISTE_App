package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleFlagshipItemBindingImpl extends SingleFlagshipItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleFlagshipItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private SingleFlagshipItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            );
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.flagshipItem == variableId) {
            setFlagshipItem((in.istevit.app.data.model.FlagshipModel) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((in.istevit.app.ui.flagship.FlagshipOnClickCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFlagshipItem(@Nullable in.istevit.app.data.model.FlagshipModel FlagshipItem) {
        this.mFlagshipItem = FlagshipItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.flagshipItem);
        super.requestRebind();
    }
    public void setCallback(@Nullable in.istevit.app.ui.flagship.FlagshipOnClickCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
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
        java.lang.String flagshipItemImage = null;
        in.istevit.app.data.model.FlagshipModel flagshipItem = mFlagshipItem;
        in.istevit.app.ui.flagship.FlagshipOnClickCallback callback = mCallback;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (flagshipItem != null) {
                        // read flagshipItem.image
                        flagshipItemImage = flagshipItem.getImage();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            in.istevit.app.adapters.FlagshipAdapterKt.loadFlagshipImage(this.imageView, flagshipItemImage);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            in.istevit.app.adapters.FlagshipAdapterKt.flagshipCallback(this.imageView, callback, flagshipItem);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): flagshipItem
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}