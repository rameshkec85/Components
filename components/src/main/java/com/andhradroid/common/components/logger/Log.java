package com.andhradroid.common.components.logger;

/**
 * Created by Ramesh on 10/12/15.
 */
public interface Log {

    int d(String var1, String var2, Object... var3);

    int e(String var1, String var2, Throwable var3, Object... var4);

    int e(String var1, String var2, Object... var3);

    int i(String var1, String var2, Object... var3);

    int v(String var1, String var2, Object... var3);

    int v(String var1, String var2, Throwable var3, Object... var4);

    int w(String var1, Throwable var2);

    int w(String var1, String var2, Object... var3);

    int w(String var1, String var2, Throwable var3, Object... var4);

    void logToLogCat(boolean var1);

    boolean getLogToLogCat();
}
