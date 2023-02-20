package in.istevit.app.databinding;
import in.istevit.app.R;
import in.istevit.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleBlogsItemBindingImpl extends SingleBlogsItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView7, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleBlogsItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private SingleBlogsItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.imageView2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
        this.textView8.setTag(null);
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
            setCallback((in.istevit.app.ui.blogs.BlogOnCLickCallback) variable);
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
    public void setCallback(@Nullable in.istevit.app.ui.blogs.BlogOnCLickCallback Callback) {
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
        java.lang.String blogDate = null;
        in.istevit.app.data.model.BlogDetailsModel blog = mBlog;
        in.istevit.app.ui.blogs.BlogOnCLickCallback callback = mCallback;
        java.lang.String javaLangStringByBlogWriter = null;
        java.lang.String blogTitle = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (blog != null) {
                        // read blog.writer
                        blogWriter = blog.getWriter();
                        // read blog.image
                        blogImage = blog.getImage();
                        // read blog.date
                        blogDate = blog.getDate();
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

            in.istevit.app.adapters.BlogsAdapterKt.loadBlogsImage(this.imageView2, blogImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, blogTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, javaLangStringByBlogWriter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, blogDate);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            in.istevit.app.adapters.BlogsAdapterKt.blogsCallback(this.mboundView5, callback, blog);
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