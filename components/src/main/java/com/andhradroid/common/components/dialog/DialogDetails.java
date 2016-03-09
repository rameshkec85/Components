package com.andhradroid.common.components.dialog;

import android.content.DialogInterface;

/**
 * Created by Ramesh on 1/3/16.
 */
public class DialogDetails {

    private String title;

    private String message;

    private String positiveBtnText;

    private String negativeBtnText;

    private String neutralBtnText;

    private DialogInterface.OnClickListener positiveBtnListener;

    private DialogInterface.OnClickListener negativeBtnListener;

    private DialogInterface.OnClickListener neutralBtnListener;

    private boolean isCancel;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPositiveBtnText() {
        return positiveBtnText;
    }

    public void setPositiveBtnText(String positiveBtnText) {
        this.positiveBtnText = positiveBtnText;
    }

    public String getNegativeBtnText() {
        return negativeBtnText;
    }

    public void setNegativeBtnText(String negativeBtnText) {
        this.negativeBtnText = negativeBtnText;
    }

    public String getNeutralBtnText() {
        return neutralBtnText;
    }

    public void setNeutralBtnText(String neutralBtnText) {
        this.neutralBtnText = neutralBtnText;
    }

    public DialogInterface.OnClickListener getPositiveBtnListener() {
        return positiveBtnListener;
    }

    public void setPositiveBtnListener(DialogInterface.OnClickListener positiveBtnListener) {
        this.positiveBtnListener = positiveBtnListener;
    }

    public DialogInterface.OnClickListener getNegativeBtnListener() {
        return negativeBtnListener;
    }

    public void setNegativeBtnListener(DialogInterface.OnClickListener negativeBtnListener) {
        this.negativeBtnListener = negativeBtnListener;
    }

    public DialogInterface.OnClickListener getNeutralBtnListener() {
        return neutralBtnListener;
    }

    public void setNeutralBtnListener(DialogInterface.OnClickListener neutralBtnListener) {
        this.neutralBtnListener = neutralBtnListener;
    }

    public boolean isCancel() {
        return isCancel;
    }

    public void setCancel(boolean cancel) {
        isCancel = cancel;
    }
}
