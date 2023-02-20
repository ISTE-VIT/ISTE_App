package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBlogDetailsBindingImpl extends ActivityBlogDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 5);
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.textView4, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBlogDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityBlogDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            , (com.google.android.material.appbar.SubtitleCollapsingToolbarLayout) bindings[1]
            );
        this.blogDescription.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.readBlogBTN.setTag(null);
        this.toolbarLayout.setTag(null);
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
        if (BR.blog == variableId) {
            setBlog((in.istevit.app.data.model.BlogDetailsModel) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((in.istevit.app.ui.blogs.ReadCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBlog(@Nullable in.istevit.app.data.model.BlogDetailsModel Blog) {
        this.mBlog = Blog;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.blog);
        super.requestRebind();
    }
    public void setCallback(@Nullable in.istevit.app.ui.blogs.ReadCallback Callback) {
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
        java.lang.String blogWriter = null;
        java.lang.String blogImage = null;
        java.lang.String BlogDescription1 = null;
        in.istevit.app.data.model.BlogDetailsModel blog = mBlog;
        in.istevit.app.ui.blogs.ReadCallback callback = mCallback;
        java.lang.String javaLangStringByBlogWriter = null;
        java.lang.String blogTitle = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (blog != null) {
                        // read blog.writer
                        blogWriter = blog.getWriter();
                        // read blog.image
                        blogImage = blog.getImage();
                        // read blog.description
                        BlogDescription1 = blog.getDescription();
                        // read blog.title
                        blogTitle = blog.getTitle();
                    }


                    // read ("by ") + (blog.writer)
                    javaLangStringByBlogWriter = ("by ") + (blogWriter);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.blogDescription, BlogDescription1);
            in.istevit.app.ui.blogs.BlogDetailsActivity.loadImage(this.imageView, blogImage);
            this.toolbarLayout.setTitle(blogTitle);
            this.toolbarLayout.setSubtitle(javaLangStringByBlogWriter);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            in.istevit.app.ui.blogs.BlogDetailsActivity.setCallback(this.readBlogBTN, callback, blog);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): blog
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}