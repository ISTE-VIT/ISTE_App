package in.istevit.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = IsteApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface IsteApp_GeneratedInjector {
  void injectIsteApp(IsteApp isteApp);
}
