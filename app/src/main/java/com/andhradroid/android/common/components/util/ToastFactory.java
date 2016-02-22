package com.andhradroid.android.common.components.util;

/**
 * Created by Ramesh on 9/2/16.
 */
public interface ToastFactory {

    public void newToast(final CharSequence text, @Duration final int duration);

    public void newToast(final int textResId, @Duration final int duration);

}
