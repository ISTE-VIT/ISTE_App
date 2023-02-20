package in.istevit.app.ui;

import in.istevit.app.R;
import in.istevit.app.databinding.ActivityMainBinding;
import in.istevit.app.ui.flagship.FlagshipActivity;
import in.istevit.app.ui.projects.ProjectsActivity;
import in.istevit.app.ui.resources.ResourcesActivity;
import in.istevit.app.util.Constants;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lin/istevit/app/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lin/istevit/app/databinding/ActivityMainBinding;", "getBinding", "()Lin/istevit/app/databinding/ActivityMainBinding;", "setBinding", "(Lin/istevit/app/databinding/ActivityMainBinding;)V", "itemSelected", "", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public in.istevit.app.databinding.ActivityMainBinding binding;
    public androidx.navigation.NavController navController;
    private int itemSelected = in.istevit.app.R.id.nav_home;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.istevit.app.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.istevit.app.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}