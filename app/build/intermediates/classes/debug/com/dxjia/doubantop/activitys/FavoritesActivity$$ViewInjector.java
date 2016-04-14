// Generated code from Butter Knife. Do not modify!
package com.dxjia.doubantop.activitys;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class FavoritesActivity$$ViewInjector<T extends com.dxjia.doubantop.activitys.FavoritesActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558506, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131558506, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131558521, "field 'mFavoritesList'");
    target.mFavoritesList = finder.castView(view, 2131558521, "field 'mFavoritesList'");
  }

  @Override public void reset(T target) {
    target.mToolbar = null;
    target.mFavoritesList = null;
  }
}
