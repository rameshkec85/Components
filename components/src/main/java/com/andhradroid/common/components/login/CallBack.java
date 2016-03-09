package com.andhradroid.common.components.login;

import android.widget.EditText;

/**
 * Created by Ramesh on 23/2/16.
 */
public interface CallBack {

    void onUserNameError(final EditText nameText);

    void onPasswordError(final EditText passwordText);

    void invalidEmail();
}
