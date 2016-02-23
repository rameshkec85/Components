package com.andhradroid.common.components.adapters;

import android.view.View;

/**
 * Created by Ramesh on 10/02/16.
 */
public abstract class AbstractViewHolder {

    private final View view;

    public AbstractViewHolder(View view) {
        this.view = view;
    }

    public View getRootView() {
        return view;
    }
}
