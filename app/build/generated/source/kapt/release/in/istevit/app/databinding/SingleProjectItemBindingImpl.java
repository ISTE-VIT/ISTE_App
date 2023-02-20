package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleProjectItemBindingImpl extends SingleProjectItemBinding  {

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
    private final android.widget.ImageView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleProjectItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private SingleProjectItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.ImageView) bindings[0];
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
        if (BR.callback == variableId) {
            setCallback((in.istevit.app.ui.projects.ProjectOnClickCallback) variable);
        }
        else if (BR.projectItem == variableId) {
            setProjectItem((in.istevit.app.data.model.ProjectsModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback(@Nullable in.istevit.app.ui.projects.ProjectOnClickCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setProjectItem(@Nullable in.istevit.app.data.model.ProjectsModel ProjectItem) {
        this.mProjectItem = ProjectItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.projectItem);
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
        in.istevit.app.ui.projects.ProjectOnClickCallback callback = mCallback;
        java.lang.String projectItemImage = null;
        in.istevit.app.data.model.ProjectsModel projectItem = mProjectItem;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (projectItem != null) {
                        // read projectItem.image
                        projectItemImage = projectItem.getImage();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            in.istevit.app.adapters.ProjectsAdapterKt.loadProjectImage(this.mboundView0, projectItemImage);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            in.istevit.app.adapters.ProjectsAdapterKt.projectsCallback(this.mboundView0, callback, projectItem);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callback
        flag 1 (0x2L): projectItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}