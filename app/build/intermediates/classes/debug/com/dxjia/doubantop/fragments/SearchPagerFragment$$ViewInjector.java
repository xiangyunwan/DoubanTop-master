// Generated code from Butter Knife. Do not modify!
package com.dxjia.doubantop.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class SearchPagerFragment$$ViewInjector<T extends com.dxjia.doubantop.fragments.SearchPagerFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558584, "field 'mEmptyView'");
    target.mEmptyView = finder.castView(view, 2131558584, "field 'mEmptyView'");
    view = finder.findRequiredView(source, 2131558585, "field 'mSearchResultContainer'");
    target.mSearchResultContainer = finder.castView(view, 2131558585, "field 'mSearchResultContainer'");
  }

  @Override public void reset(T target) {
    target.mEmptyView = null;
    target.mSearchResultContainer = null;
  }
}
