package com.andhradroid.common.components.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

//@Singleton
public class ActivityHelper {

    final Context mContext;

    //    @Inject
    public ActivityHelper(Context context) {
        mContext = context;
    }

    public void launchActivity(Class<?> toClazz) {
        Intent intent = new Intent(mContext, toClazz);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }

    public void launchActivity(final Bundle bundle, Class<?> toClazz) {
        Intent intent = new Intent(mContext, toClazz);
        intent.putExtras(bundle);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }
}
