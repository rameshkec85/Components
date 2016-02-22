package com.andhradroid.android.common.components.util;

/**
 * Created by Ramesh on 22/2/16.
 */

import android.support.annotation.IntDef;
import android.widget.Toast;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({Toast.LENGTH_SHORT, Toast.LENGTH_LONG})
@Retention(RetentionPolicy.SOURCE)
public @interface Duration {
}