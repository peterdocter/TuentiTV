/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pedrovgs.tuentitv.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.github.pedrovgs.tuentitv.R;
import com.github.pedrovgs.tuentitv.ui.navigator.Navigator;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;

/**
 * Activity created to show SearchFragment.
 *
 * @author Pedro Vicente Gómez Sánchez
 */
public class SearchActivity extends BaseActivity {

  @Inject Navigator navigator;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.search_activity);
  }

  @Override public boolean onSearchRequested() {
    navigator.openSearchView();
    return true;
  }

  @Override protected List getModules() {
    return new LinkedList();
  }
}
