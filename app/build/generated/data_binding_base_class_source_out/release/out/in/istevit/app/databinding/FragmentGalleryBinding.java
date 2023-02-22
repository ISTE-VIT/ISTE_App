// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import in.istevit.app.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentGalleryBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RecyclerView recyclerView;

  protected FragmentGalleryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout linearLayout, RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.linearLayout = linearLayout;
    this.recyclerView = recyclerView;
  }

  @NonNull
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGalleryBinding>inflateInternal(inflater, R.layout.fragment_gallery, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGalleryBinding>inflateInternal(inflater, R.layout.fragment_gallery, null, false, component);
  }

  public static FragmentGalleryBinding bind(@NonNull View view) {
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
  public static FragmentGalleryBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGalleryBinding)bind(component, view, R.layout.fragment_gallery);
  }
}