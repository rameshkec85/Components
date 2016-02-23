package com.andhradroid.common.components.logger;

/**
 * Created by Ramesh on 10/12/15.
 */
public class LogImpl implements Log {

    @Override
    public void i(String tag, String message) {
        android.util.Log.i(tag, message);
    }

    @Override
    public void d(String tag, String message) {
        android.util.Log.d(tag, message);
    }

    @Override
    public void w(String tag, String message) {
        android.util.Log.w(tag, message);
    }

    @Override
    public void e(String tag, String message) {
        android.util.Log.e(tag, message);
    }
}
