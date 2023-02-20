package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEventBindingImpl extends FragmentEventBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 1);
        sViewsWithIds.put(R.id.horizontal_scrollview, 2);
        sViewsWithIds.put(R.id.chipGroup, 3);
        sViewsWithIds.put(R.id.chip_all, 4);
        sViewsWithIds.put(R.id.chip_ongoing, 5);
        sViewsWithIds.put(R.id.chip_upcoming, 6);
        sViewsWithIds.put(R.id.chip_completed, 7);
        sViewsWithIds.put(R.id.recycler_view, 8);
        sViewsWithIds.put(R.id.progress_circular, 9);
        sViewsWithIds.put(R.id.animationView, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (com.google.android.material.chip.Chip) bindings[4]
            , (com.google.android.material.chip.Chip) bindings[7]
            , (com.google.android.material.chip.ChipGroup) bindings[3]
            , (com.google.android.material.chip.Chip) bindings[5]
            , (com.google.android.material.chip.Chip) bindings[6]
            , (android.widget.HorizontalScrollView) bindings[2]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}