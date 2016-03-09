package com.andhradroid.common.components.logger;

/**
 * Created by Ramesh on 10/12/15.
 */
public class LogImpl implements Log {

    private boolean mLogToLogCat;

    public LogImpl() {
    }

    public void logToLogCat(boolean logToLogCat) {
        this.mLogToLogCat = logToLogCat;
    }

    public boolean getLogToLogCat() {
        return this.mLogToLogCat;
    }

    public int d(String tag, String format, Object... args) {
        return this.mLogToLogCat && format != null ? android.util.Log.d(tag, getThreadId().concat(LogUtils.getFormattedString(format, args))) : 0;
    }

    public int e(String tag, String format, Throwable throwable, Object... args) {
        return this.mLogToLogCat && format != null ? android.util.Log.e(tag, getThreadId().concat(LogUtils.getFormattedString(format, args)), throwable) : 0;
    }

    public int e(String tag, String format, Object... args) {
        return this.e(tag, format, (Throwable) null, args);
    }

    public int i(String tag, String format, Object... args) {
        return this.mLogToLogCat && format != null ? android.util.Log.i(tag, getThreadId().concat(LogUtils.getFormattedString(format, args))) : 0;
    }

    public int v(String tag, String format, Throwable throwable, Object... args) {
        return this.mLogToLogCat && format != null ? android.util.Log.v(tag, getThreadId().concat(LogUtils.getFormattedString(format, args)), throwable) : 0;
    }

    public int v(String tag, String format, Object... args) {
        return this.v(tag, format, (Throwable) null, args);
    }

    public int w(String tag, String format, Object... args) {
        return this.w(tag, format, (Throwable) null, args);
    }

    public int w(String tag, Throwable throwable) {
        return this.mLogToLogCat ? android.util.Log.w(tag, getThreadId(), throwable) : 0;
    }

    public int w(String tag, String format, Throwable throwable, Object... args) {
        return this.mLogToLogCat && format != null ? android.util.Log.w(tag, getThreadId().concat(LogUtils.getFormattedString(format, args)), throwable) : 0;
    }

    private static String getThreadId() {
        return String.format("[%d]\t ", new Object[]{Long.valueOf(Thread.currentThread().getId())});
    }
}
