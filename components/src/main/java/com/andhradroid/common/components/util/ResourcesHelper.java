package com.andhradroid.common.components.util;

import android.content.Context;
import android.support.annotation.StringRes;

/**
 * Created by Ramesh on 17/2/16.
 */
//@Singleton
public class ResourcesHelper {
    final Context mContext;

//    @Inject
    public ResourcesHelper(final Context context) {
        mContext = context;
    }

    public String getString(@StringRes int resId) {
        return mContext.getResources().getString(resId);
    }

}
