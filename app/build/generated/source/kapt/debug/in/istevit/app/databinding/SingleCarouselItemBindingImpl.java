package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleCarouselItemBindingImpl extends SingleCarouselItemBinding  {

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

    public SingleCarouselItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private SingleCarouselItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.carouselImageView.setTag(null);
        this.carouselMainCard.setTag(null);
        this.carouselTitle.setTag(null);
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
        if (BR.listItem == variableId) {
            setListItem((in.istevit.app.data.model.home.HomeCarouselData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListItem(@Nullable in.istevit.app.data.model.home.HomeCarouselData ListItem) {
        this.mListItem = ListItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listItem);
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
        in.istevit.app.data.model.home.HomeCarouselData listItem = mListItem;
        java.lang.String listItemTitle = null;
        java.lang.String listItemImage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listItem != null) {
                    // read listItem.title
                    listItemTitle = listItem.getTitle();
                    // read listItem.image
                    listItemImage = listItem.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            in.istevit.app.adapters.CarouselAdapterKt.loadCarouselImage(this.carouselImageView, listItemImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.carouselTitle, listItemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}