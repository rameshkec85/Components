package com.andhradroid.common.components.util;

import android.location.Location;
import android.support.annotation.Nullable;

import com.andhradroid.common.components.logger.Log;

import java.text.DecimalFormat;

/**
 * Created by Ramesh on 23/2/16.
 */
public class LocationUtil {

    private final static String TAG = "LocationUtil";

    private final Log log;

    public LocationUtil(@Nullable final Log log) {
        this.log = log;
    }

    /**
     * @param fromLatitude
     * @param fromLongitude
     * @param toLatitude
     * @param toLongitude
     * @return distance between the two latitudes and longitudes in kms.
     */
    public double calculateDistance(final double fromLatitude, final double fromLongitude, final double toLatitude, double toLongitude) {
        float results[] = new float[1];

        try {
            Location.distanceBetween(fromLatitude, fromLongitude, toLatitude, toLongitude, results);
        } catch (final Exception e) {
            if (e != null && log != null)
                log.w(TAG, e.getMessage());
        }

        int dist = (int) results[0];
        if (dist <= 0)
            return 0D;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        results[0] /= 1000D;
        String distance = decimalFormat.format(results[0]);
        double d = Double.parseDouble(distance);
        return d;
    }
}
