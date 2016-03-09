package com.andhradroid.common.components.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;

/**
 * Created by Ramesh on 29/2/16.
 */
public class DialogFactory {

    /**
     * @param context
     * @param dialogDetails
     * @return
     */
    public Dialog newDialog(final Context context, final DialogDetails dialogDetails) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(dialogDetails.getTitle());
        builder.setMessage(dialogDetails.getMessage());
        builder.setPositiveButton(dialogDetails.getPositiveBtnText(), dialogDetails.getPositiveBtnListener());
        builder.setNegativeButton(dialogDetails.getNegativeBtnText(), dialogDetails.getNegativeBtnListener());
        builder.setNeutralButton(dialogDetails.getNeutralBtnText(), dialogDetails.getNeutralBtnListener());
        builder.setCancelable(dialogDetails.isCancel());
        return builder.create();
    }
}
