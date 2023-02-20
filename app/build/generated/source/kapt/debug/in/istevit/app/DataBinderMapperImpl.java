package in.istevit.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import in.istevit.app.databinding.ActivityBlogDetailsBindingImpl;
import in.istevit.app.databinding.ActivityEventDetailsBindingImpl;
import in.istevit.app.databinding.ActivityFlagshipBindingImpl;
import in.istevit.app.databinding.ActivityFlagshipDetailsBindingImpl;
import in.istevit.app.databinding.ActivityMainBindingImpl;
import in.istevit.app.databinding.ActivityOnBoardingBindingImpl;
import in.istevit.app.databinding.ActivityProjectsBindingImpl;
import in.istevit.app.databinding.ActivityResourcesBindingImpl;
import in.istevit.app.databinding.ActivityResourcesDetailBindingImpl;
import in.istevit.app.databinding.ActivitySplashBindingImpl;
import in.istevit.app.databinding.FragmentAnnouncementsBindingImpl;
import in.istevit.app.databinding.FragmentBlogBindingImpl;
import in.istevit.app.databinding.FragmentEventBindingImpl;
import in.istevit.app.databinding.FragmentGalleryBindingImpl;
import in.istevit.app.databinding.FragmentOnboardingBindingImpl;
import in.istevit.app.databinding.SingleAnnouncementsItemBindingImpl;
import in.istevit.app.databinding.SingleBlogsItemBindingImpl;
import in.istevit.app.databinding.SingleCarouselItemBindingImpl;
import in.istevit.app.databinding.SingleEventsItemBindingImpl;
import in.istevit.app.databinding.SingleFlagshipItemBindingImpl;
import in.istevit.app.databinding.SingleGalleryItemBindingImpl;
import in.istevit.app.databinding.SingleProjectItemBindingImpl;
import in.istevit.app.databinding.SingleResourcesDetailItemBindingImpl;
import in.istevit.app.databinding.SingleResourcesInnerItemBindingImpl;
import in.istevit.app.databinding.SingleResourcesItemBindingImpl;
import in.istevit.app.databinding.SingleTracksItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBLOGDETAILS = 1;

  private static final int LAYOUT_ACTIVITYEVENTDETAILS = 2;

  private static final int LAYOUT_ACTIVITYFLAGSHIP = 3;

  private static final int LAYOUT_ACTIVITYFLAGSHIPDETAILS = 4;

  private static final int LAYOUT_ACTIVITYMAIN = 5;

  private static final int LAYOUT_ACTIVITYONBOARDING = 6;

  private static final int LAYOUT_ACTIVITYPROJECTS = 7;

  private static final int LAYOUT_ACTIVITYRESOURCES = 8;

  private static final int LAYOUT_ACTIVITYRESOURCESDETAIL = 9;

  private static final int LAYOUT_ACTIVITYSPLASH = 10;

  private static final int LAYOUT_FRAGMENTANNOUNCEMENTS = 11;

  private static final int LAYOUT_FRAGMENTBLOG = 12;

  private static final int LAYOUT_FRAGMENTEVENT = 13;

  private static final int LAYOUT_FRAGMENTGALLERY = 14;

  private static final int LAYOUT_FRAGMENTONBOARDING = 15;

  private static final int LAYOUT_SINGLEANNOUNCEMENTSITEM = 16;

  private static final int LAYOUT_SINGLEBLOGSITEM = 17;

  private static final int LAYOUT_SINGLECAROUSELITEM = 18;

  private static final int LAYOUT_SINGLEEVENTSITEM = 19;

  private static final int LAYOUT_SINGLEFLAGSHIPITEM = 20;

  private static final int LAYOUT_SINGLEGALLERYITEM = 21;

  private static final int LAYOUT_SINGLEPROJECTITEM = 22;

  private static final int LAYOUT_SINGLERESOURCESDETAILITEM = 23;

  private static final int LAYOUT_SINGLERESOURCESINNERITEM = 24;

  private static final int LAYOUT_SINGLERESOURCESITEM = 25;

  private static final int LAYOUT_SINGLETRACKSITEM = 26;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(26);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_blog_details, LAYOUT_ACTIVITYBLOGDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_event_details, LAYOUT_ACTIVITYEVENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_flagship, LAYOUT_ACTIVITYFLAGSHIP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_flagship_details, LAYOUT_ACTIVITYFLAGSHIPDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_on_boarding, LAYOUT_ACTIVITYONBOARDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_projects, LAYOUT_ACTIVITYPROJECTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_resources, LAYOUT_ACTIVITYRESOURCES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_resources_detail, LAYOUT_ACTIVITYRESOURCESDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.fragment_announcements, LAYOUT_FRAGMENTANNOUNCEMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.fragment_blog, LAYOUT_FRAGMENTBLOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.fragment_event, LAYOUT_FRAGMENTEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.fragment_gallery, LAYOUT_FRAGMENTGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.fragment_onboarding, LAYOUT_FRAGMENTONBOARDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_announcements_item, LAYOUT_SINGLEANNOUNCEMENTSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_blogs_item, LAYOUT_SINGLEBLOGSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_carousel_item, LAYOUT_SINGLECAROUSELITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_events_item, LAYOUT_SINGLEEVENTSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_flagship_item, LAYOUT_SINGLEFLAGSHIPITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_gallery_item, LAYOUT_SINGLEGALLERYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_project_item, LAYOUT_SINGLEPROJECTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_resources_detail_item, LAYOUT_SINGLERESOURCESDETAILITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_resources_inner_item, LAYOUT_SINGLERESOURCESINNERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_resources_item, LAYOUT_SINGLERESOURCESITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.istevit.app.R.layout.single_tracks_item, LAYOUT_SINGLETRACKSITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBLOGDETAILS: {
          if ("layout/activity_blog_details_0".equals(tag)) {
            return new ActivityBlogDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_blog_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEVENTDETAILS: {
          if ("layout/activity_event_details_0".equals(tag)) {
            return new ActivityEventDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_event_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFLAGSHIP: {
          if ("layout/activity_flagship_0".equals(tag)) {
            return new ActivityFlagshipBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_flagship is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFLAGSHIPDETAILS: {
          if ("layout/activity_flagship_details_0".equals(tag)) {
            return new ActivityFlagshipDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_flagship_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYONBOARDING: {
          if ("layout/activity_on_boarding_0".equals(tag)) {
            return new ActivityOnBoardingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_on_boarding is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROJECTS: {
          if ("layout/activity_projects_0".equals(tag)) {
            return new ActivityProjectsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_projects is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESOURCES: {
          if ("layout/activity_resources_0".equals(tag)) {
            return new ActivityResourcesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_resources is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESOURCESDETAIL: {
          if ("layout/activity_resources_detail_0".equals(tag)) {
            return new ActivityResourcesDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_resources_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTANNOUNCEMENTS: {
          if ("layout/fragment_announcements_0".equals(tag)) {
            return new FragmentAnnouncementsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_announcements is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBLOG: {
          if ("layout/fragment_blog_0".equals(tag)) {
            return new FragmentBlogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_blog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEVENT: {
          if ("layout/fragment_event_0".equals(tag)) {
            return new FragmentEventBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_event is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGALLERY: {
          if ("layout/fragment_gallery_0".equals(tag)) {
            return new FragmentGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDING: {
          if ("layout/fragment_onboarding_0".equals(tag)) {
            return new FragmentOnboardingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEANNOUNCEMENTSITEM: {
          if ("layout/single_announcements_item_0".equals(tag)) {
            return new SingleAnnouncementsItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_announcements_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEBLOGSITEM: {
          if ("layout/single_blogs_item_0".equals(tag)) {
            return new SingleBlogsItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_blogs_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLECAROUSELITEM: {
          if ("layout/single_carousel_item_0".equals(tag)) {
            return new SingleCarouselItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_carousel_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEEVENTSITEM: {
          if ("layout/single_events_item_0".equals(tag)) {
            return new SingleEventsItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_events_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEFLAGSHIPITEM: {
          if ("layout/single_flagship_item_0".equals(tag)) {
            return new SingleFlagshipItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_flagship_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEGALLERYITEM: {
          if ("layout/single_gallery_item_0".equals(tag)) {
            return new SingleGalleryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_gallery_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEPROJECTITEM: {
          if ("layout/single_project_item_0".equals(tag)) {
            return new SingleProjectItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_project_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLERESOURCESDETAILITEM: {
          if ("layout/single_resources_detail_item_0".equals(tag)) {
            return new SingleResourcesDetailItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_resources_detail_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLERESOURCESINNERITEM: {
          if ("layout/single_resources_inner_item_0".equals(tag)) {
            return new SingleResourcesInnerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_resources_inner_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLERESOURCESITEM: {
          if ("layout/single_resources_item_0".equals(tag)) {
            return new SingleResourcesItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_resources_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLETRACKSITEM: {
          if ("layout/single_tracks_item_0".equals(tag)) {
            return new SingleTracksItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_tracks_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(12);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "blog");
      sKeys.put(2, "callback");
      sKeys.put(3, "event");
      sKeys.put(4, "flagshipDetailsItem");
      sKeys.put(5, "flagshipItem");
      sKeys.put(6, "galleryItem");
      sKeys.put(7, "listItem");
      sKeys.put(8, "ogpItem");
      sKeys.put(9, "projectItem");
      sKeys.put(10, "resLinksItem");
      sKeys.put(11, "resourcesItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(26);

    static {
      sKeys.put("layout/activity_blog_details_0", in.istevit.app.R.layout.activity_blog_details);
      sKeys.put("layout/activity_event_details_0", in.istevit.app.R.layout.activity_event_details);
      sKeys.put("layout/activity_flagship_0", in.istevit.app.R.layout.activity_flagship);
      sKeys.put("layout/activity_flagship_details_0", in.istevit.app.R.layout.activity_flagship_details);
      sKeys.put("layout/activity_main_0", in.istevit.app.R.layout.activity_main);
      sKeys.put("layout/activity_on_boarding_0", in.istevit.app.R.layout.activity_on_boarding);
      sKeys.put("layout/activity_projects_0", in.istevit.app.R.layout.activity_projects);
      sKeys.put("layout/activity_resources_0", in.istevit.app.R.layout.activity_resources);
      sKeys.put("layout/activity_resources_detail_0", in.istevit.app.R.layout.activity_resources_detail);
      sKeys.put("layout/activity_splash_0", in.istevit.app.R.layout.activity_splash);
      sKeys.put("layout/fragment_announcements_0", in.istevit.app.R.layout.fragment_announcements);
      sKeys.put("layout/fragment_blog_0", in.istevit.app.R.layout.fragment_blog);
      sKeys.put("layout/fragment_event_0", in.istevit.app.R.layout.fragment_event);
      sKeys.put("layout/fragment_gallery_0", in.istevit.app.R.layout.fragment_gallery);
      sKeys.put("layout/fragment_onboarding_0", in.istevit.app.R.layout.fragment_onboarding);
      sKeys.put("layout/single_announcements_item_0", in.istevit.app.R.layout.single_announcements_item);
      sKeys.put("layout/single_blogs_item_0", in.istevit.app.R.layout.single_blogs_item);
      sKeys.put("layout/single_carousel_item_0", in.istevit.app.R.layout.single_carousel_item);
      sKeys.put("layout/single_events_item_0", in.istevit.app.R.layout.single_events_item);
      sKeys.put("layout/single_flagship_item_0", in.istevit.app.R.layout.single_flagship_item);
      sKeys.put("layout/single_gallery_item_0", in.istevit.app.R.layout.single_gallery_item);
      sKeys.put("layout/single_project_item_0", in.istevit.app.R.layout.single_project_item);
      sKeys.put("layout/single_resources_detail_item_0", in.istevit.app.R.layout.single_resources_detail_item);
      sKeys.put("layout/single_resources_inner_item_0", in.istevit.app.R.layout.single_resources_inner_item);
      sKeys.put("layout/single_resources_item_0", in.istevit.app.R.layout.single_resources_item);
      sKeys.put("layout/single_tracks_item_0", in.istevit.app.R.layout.single_tracks_item);
    }
  }
}
