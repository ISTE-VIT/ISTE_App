package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleGalleryItemBindingImpl extends SingleGalleryItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleGalleryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private SingleGalleryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[0]
            );
        this.imageView.setTag(null);
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
        if (BR.galleryItem == variableId) {
            setGalleryItem((in.istevit.app.data.model.GalleryModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGalleryItem(@Nullable in.istevit.app.data.model.GalleryModel GalleryItem) {
        this.mGalleryItem = GalleryItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.galleryItem);
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
        java.lang.String galleryItemImage = null;
        in.istevit.app.data.model.GalleryModel galleryItem = mGalleryItem;

        if ((dirtyFlags & 0x3L) != 0) {



                if (galleryItem != null) {
                    // read galleryItem.image
                    galleryItemImage = galleryItem.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            in.istevit.app.adapters.GalleryAdapterKt.loadGalleryImage(this.imageView, galleryItemImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): galleryItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}