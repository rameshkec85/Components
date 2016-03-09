package com.andhradroid.common.components.logger;

public final class LogUtils {
    private LogUtils() {
    }

    public static String getFormattedString(String format, Object... args) {
        return args != null && args.length > 0 && format != null?String.format(format, args):format;
    }
}