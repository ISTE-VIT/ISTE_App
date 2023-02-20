package in.istevit.app.ui.events;

import in.istevit.app.data.model.EventDetailsModel;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lin/istevit/app/ui/events/EventOnClickCallback;", "", "onClick", "", "item", "Lin/istevit/app/data/model/EventDetailsModel;", "app_release"})
public abstract interface EventOnClickCallback {
    
    public abstract void onClick(@org.jetbrains.annotations.NotNull()
    in.istevit.app.data.model.EventDetailsModel item);
}