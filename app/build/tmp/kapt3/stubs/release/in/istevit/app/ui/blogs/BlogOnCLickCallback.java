package in.istevit.app.ui.blogs;

import in.istevit.app.data.model.BlogDetailsModel;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lin/istevit/app/ui/blogs/BlogOnCLickCallback;", "", "onClick", "", "item", "Lin/istevit/app/data/model/BlogDetailsModel;", "app_release"})
public abstract interface BlogOnCLickCallback {
    
    public abstract void onClick(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.BlogDetailsModel item);
}