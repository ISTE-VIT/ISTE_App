package in.istevit.app.ui.onBoarding;

import in.istevit.app.R;
import in.istevit.app.databinding.ActivityOnBoardingBinding;
import in.istevit.app.ui.MainActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lin/istevit/app/ui/onBoarding/OnBoardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lin/istevit/app/databinding/ActivityOnBoardingBinding;", "getBinding", "()Lin/istevit/app/databinding/ActivityOnBoardingBinding;", "setBinding", "(Lin/istevit/app/databinding/ActivityOnBoardingBinding;)V", "context", "Landroid/content/Context;", "pagerAdapter", "Lin/istevit/app/ui/onBoarding/OnBoardingActivity$OnboardingPagerAdapter;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "OnboardingPagerAdapter", "app_release"})
public final class OnBoardingActivity extends androidx.appcompat.app.AppCompatActivity {
    private final android.content.Context context = null;
    private in.istevit.app.ui.onBoarding.OnBoardingActivity.OnboardingPagerAdapter pagerAdapter;
    public in.istevit.app.databinding.ActivityOnBoardingBinding binding;
    
    public OnBoardingActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.ActivityOnBoardingBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.ActivityOnBoardingBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lin/istevit/app/ui/onBoarding/OnBoardingActivity$OnboardingPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lin/istevit/app/ui/onBoarding/OnBoardingActivity;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "app_release"})
    final class OnboardingPagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
        
        public OnboardingPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
            super(null);
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
    }
}