package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleAnnouncementsItemBindingImpl extends SingleAnnouncementsItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 4);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleAnnouncementsItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private SingleAnnouncementsItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.announcementsRoot.setTag(null);
        this.eventNameTV.setTag(null);
        this.imgView.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
            setListItem((in.istevit.app.data.model.home.HomeAnnouncementsData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListItem(@Nullable in.istevit.app.data.model.home.HomeAnnouncementsData ListItem) {
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
        in.istevit.app.data.model.home.HomeAnnouncementsData listItem = mListItem;
        java.lang.String listItemTitle = null;
        java.lang.String listItemDescription = null;
        java.lang.String listItemImage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listItem != null) {
                    // read listItem.title
                    listItemTitle = listItem.getTitle();
                    // read listItem.description
                    listItemDescription = listItem.getDescription();
                    // read listItem.image
                    listItemImage = listItem.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eventNameTV, listItemTitle);
            in.istevit.app.adapters.AnnouncementsAdapterKt.loadAnnouncementsImage(this.imgView, listItemImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, listItemDescription);
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