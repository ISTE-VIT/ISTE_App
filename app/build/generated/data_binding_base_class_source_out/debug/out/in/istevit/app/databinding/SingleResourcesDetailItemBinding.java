// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import in.istevit.app.R;
import in.istevit.app.data.model.resources.ResourcesOgpData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SingleResourcesDetailItemBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView textView12;

  @Bindable
  protected ResourcesOgpData mResLinksItem;

  protected SingleResourcesDetailItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView recyclerView, TextView textView12) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
    this.textView12 = textView12;
  }

  public abstract void setResLinksItem(@Nullable ResourcesOgpData resLinksItem);

  @Nullable
  public ResourcesOgpData getResLinksItem() {
    return mResLinksItem;
  }

  @NonNull
  public static SingleResourcesDetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_resources_detail_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SingleResourcesDetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SingleResourcesDetailItemBinding>inflateInternal(inflater, R.layout.single_resources_detail_item, root, attachToRoot, component);
  }

  @NonNull
  public static SingleResourcesDetailItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_resources_detail_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SingleResourcesDetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SingleResourcesDetailItemBinding>inflateInternal(inflater, R.layout.single_resources_detail_item, null, false, component);
  }

  public static SingleResourcesDetailItemBinding bind(@NonNull View view) {
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
  public static SingleResourcesDetailItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (SingleResourcesDetailItemBinding)bind(component, view, R.layout.single_resources_detail_item);
  }
}