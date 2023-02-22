// Generated by Dagger (https://dagger.dev).
package in.istevit.app.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.istevit.app.data.network.service.CommonNetworkService;
import in.istevit.app.data.repository.blogs.BlogsRepoImpl;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideBlogsRepositoryFactory implements Factory<BlogsRepoImpl> {
  private final Provider<CommonNetworkService> serviceProvider;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideBlogsRepositoryFactory(Provider<CommonNetworkService> serviceProvider,
      Provider<Context> contextProvider) {
    this.serviceProvider = serviceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public BlogsRepoImpl get() {
    return provideBlogsRepository(serviceProvider.get(), contextProvider.get());
  }

  public static AppModule_ProvideBlogsRepositoryFactory create(
      Provider<CommonNetworkService> serviceProvider, Provider<Context> contextProvider) {
    return new AppModule_ProvideBlogsRepositoryFactory(serviceProvider, contextProvider);
  }

  public static BlogsRepoImpl provideBlogsRepository(CommonNetworkService service,
      Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBlogsRepository(service, context));
  }
}