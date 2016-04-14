// Generated code from Butter Knife. Do not modify!
package com.dxjia.doubantop.activitys;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class DetailActivity$$ViewInjector<T extends com.dxjia.doubantop.activitys.DetailActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558506, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131558506, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131558518, "field 'mCollapsingToolbar'");
    target.mCollapsingToolbar = finder.castView(view, 2131558518, "field 'mCollapsingToolbar'");
    view = finder.findRequiredView(source, 2131558519, "field 'mMovieImageView'");
    target.mMovieImageView = finder.castView(view, 2131558519, "field 'mMovieImageView'");
    view = finder.findRequiredView(source, 2131558517, "field 'mAppBar'");
    target.mAppBar = finder.castView(view, 2131558517, "field 'mAppBar'");
  }

  @Override public void reset(T target) {
    target.mToolbar = null;
    target.mCollapsingToolbar = null;
    target.mMovieImageView = null;
    target.mAppBar = null;
  }
}
