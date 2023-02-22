// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import in.istevit.app.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityOnBoardingBinding extends ViewDataBinding {
  @NonNull
  public final Button next;

  @NonNull
  public final ViewPager viewPager;

  protected ActivityOnBoardingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button next, ViewPager viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.next = next;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_on_boarding, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityOnBoardingBinding>inflateInternal(inflater, R.layout.activity_on_boarding, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_on_boarding, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityOnBoardingBinding>inflateInternal(inflater, R.layout.activity_on_boarding, null, false, component);
  }

  public static ActivityOnBoardingBinding bind(@NonNull View view) {
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
  public static ActivityOnBoardingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityOnBoardingBinding)bind(component, view, R.layout.activity_on_boarding);
  }
}