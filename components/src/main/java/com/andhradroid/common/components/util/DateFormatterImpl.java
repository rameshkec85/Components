package com.andhradroid.common.components.util;

import android.support.annotation.Nullable;

import com.andhradroid.common.components.logger.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ramesh on 26/2/16.
 */
public class DateFormatterImpl implements Formatter {

    public static final String TAG = "DateFormatterImpl";

    private final Log mLog;

    public DateFormatterImpl(@Nullable final Log log) {
        this.mLog = log;
    }

    @Override
    public String convertDateToString(final Date date, final String toPattern) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat(toPattern);
        return dateFormat.format(date);
    }

    @Override
    @Nullable
    public Date convertStringToDate(final String date, final String fromPattern) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat(fromPattern);
        try {
            return dateFormat.parse(date);
        } catch (final ParseException e) {
            if (mLog != null) {
                mLog.w(TAG, "convertStringToDate: error parsing string :" + date);
            }
        }
        return null;
    }
}
