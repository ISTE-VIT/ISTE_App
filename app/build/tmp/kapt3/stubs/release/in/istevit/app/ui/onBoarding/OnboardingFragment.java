package in.istevit.app.ui.onBoarding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import in.istevit.app.R;
import in.istevit.app.databinding.FragmentOnboardingBinding;
import android.util.Log;
import androidx.core.content.ContextCompat;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lin/istevit/app/ui/onBoarding/OnboardingFragment;", "Landroidx/fragment/app/Fragment;", "position", "", "(I)V", "binding", "Lin/istevit/app/databinding/FragmentOnboardingBinding;", "getBinding", "()Lin/istevit/app/databinding/FragmentOnboardingBinding;", "setBinding", "(Lin/istevit/app/databinding/FragmentOnboardingBinding;)V", "images", "", "texts", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_release"})
public final class OnboardingFragment extends androidx.fragment.app.Fragment {
    private final int position = 0;
    public in.istevit.app.databinding.FragmentOnboardingBinding binding;
    private final int[] images = {in.istevit.app.R.drawable.onboarding_1, in.istevit.app.R.drawable.onboarding_2, in.istevit.app.R.drawable.onboarding_1};
    private final int[] texts = {in.istevit.app.R.string.on_boarding_1, in.istevit.app.R.string.on_boarding_2, in.istevit.app.R.string.on_boarding_3};
    
    public OnboardingFragment(int position) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.FragmentOnboardingBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.FragmentOnboardingBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}