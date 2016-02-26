package com.andhradroid.common.components.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Ramesh on 26/2/16.
 */
public class ConnectivityHelper {

    private Context mContext;

    public ConnectivityHelper(final Context context) {
        mContext = context;
    }

    /**
     * Indicates whether network connectivity exists or is in the process
     * of being established.
     *
     * @return {@code true} if network connectivity exists or is in the process
     * of being established, {@code false} otherwise.
     */
    public boolean isConnected() {
        final ConnectivityManager cm =
                (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        final NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            final boolean isConnected = activeNetwork.isConnectedOrConnecting();
            return isConnected;
        }
        return false;
    }

    /**
     * Connection type.
     *
     * @return
     */
    public int getConnectionType() {
        final ConnectivityManager cm =
                (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        final NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            return activeNetwork.getType();
        }
        return -1;
    }
}
