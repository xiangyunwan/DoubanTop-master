// Generated code from Butter Knife. Do not modify!
package com.dxjia.doubantop.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class SwipeRefreshFragment$$ViewInjector<T extends com.dxjia.doubantop.fragments.SwipeRefreshFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558594, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = finder.castView(view, 2131558594, "field 'mSwipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558595, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131558595, "field 'mRecyclerView'");
  }

  @Override public void reset(T target) {
    target.mSwipeRefreshLayout = null;
    target.mRecyclerView = null;
  }
}
