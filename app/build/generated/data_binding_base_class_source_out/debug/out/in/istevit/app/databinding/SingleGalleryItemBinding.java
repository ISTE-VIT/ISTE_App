// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import in.istevit.app.R;
import in.istevit.app.data.model.GalleryModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SingleGalleryItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @Bindable
  protected GalleryModel mGalleryItem;

  protected SingleGalleryItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
  }

  public abstract void setGalleryItem(@Nullable GalleryModel galleryItem);

  @Nullable
  public GalleryModel getGalleryItem() {
    return mGalleryItem;
  }

  @NonNull
  public static SingleGalleryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_gallery_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SingleGalleryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SingleGalleryItemBinding>inflateInternal(inflater, R.layout.single_gallery_item, root, attachToRoot, component);
  }

  @NonNull
  public static SingleGalleryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_gallery_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SingleGalleryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SingleGalleryItemBinding>inflateInternal(inflater, R.layout.single_gallery_item, null, false, component);
  }

  public static SingleGalleryItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SingleGalleryItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SingleGalleryItemBinding)bind(component, view, R.layout.single_gallery_item);
  }
}