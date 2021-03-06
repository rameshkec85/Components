package com.andhradroid.common.components.util;

/**
 * Created by Ramesh on 9/2/16.
 */
public interface ToastFactory {

    public void newToast(final CharSequence text, @Duration final int duration);

    public void newToast(final int textResId, @Duration final int duration);

    public void showToast(final CharSequence text);

    public void showToast(final int textResId);

}
