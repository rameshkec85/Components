package com.andhradroid.android.common.components.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ramesh on 9/2/16.
 */
public class ToastFactoryImpl implements ToastFactory {

    final Context context;

    public ToastFactoryImpl(final Context context) {
        this.context = context;
    }

    @Override
    public void newToast(CharSequence text, int duration) {
        Toast.makeText(context, text, duration).show();
    }

    @Override
    public void newToast(int textResId, int duration) {
        Toast.makeText(context, textResId, duration).show();
    }
}
