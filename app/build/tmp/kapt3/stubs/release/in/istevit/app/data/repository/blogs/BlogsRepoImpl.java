package in.istevit.app.data.repository.blogs;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import in.istevit.app.data.model.BlogDetailsModel;
import in.istevit.app.data.network.service.CommonNetworkService;
import android.util.Log;
import java.net.UnknownHostException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lin/istevit/app/data/repository/blogs/BlogsRepoImpl;", "", "service", "Lin/istevit/app/data/network/service/CommonNetworkService;", "context", "Landroid/content/Context;", "(Lin/istevit/app/data/network/service/CommonNetworkService;Landroid/content/Context;)V", "ai", "Landroid/content/pm/ApplicationInfo;", "key", "", "value", "fetchEventsData", "Lkotlin/Result;", "", "Lin/istevit/app/data/model/BlogDetailsModel;", "fetchEventsData-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class BlogsRepoImpl {
    private final in.istevit.app.data.network.service.CommonNetworkService service = null;
    private final android.content.pm.ApplicationInfo ai = null;
    private final java.lang.Object value = null;
    private final java.lang.String key = null;
    
    @javax.inject.Inject()
    public BlogsRepoImpl(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.network.service.CommonNetworkService service, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}