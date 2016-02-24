package com.andhradroid.common.components.login;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

/**
 * Created by Ramesh on 23/2/16.
 */
public class LoginBasicValidation {

    private boolean basicEmailIdValidation;

    /**
     * Set basic email id validation.
     *
     * @param basicEmailIdValidation
     * @return
     */
    public LoginBasicValidation setBasicEmailIdValidation(final boolean basicEmailIdValidation) {
        this.basicEmailIdValidation = basicEmailIdValidation;
        return this;
    }

    public boolean validate(@NonNull final EditText userName, @NonNull final EditText password, @Nullable final CallBack callBack) {
        boolean valid = false;
        if (TextUtils.isEmpty(userName.getText().toString().trim())) {
            if (callBack != null) {
                callBack.onUserNameError(userName);
            }
        } else if (TextUtils.isEmpty(password.getText().toString().trim())) {
            if (callBack != null) {
                callBack.onPasswordError(password);
            }
        } else if (basicEmailIdValidation
                && !validEmail(password.getText().toString().trim())) {
            if (callBack != null) {
                callBack.invalidEmail();
            }
        } else {
            valid = true;
        }
        return valid;
    }

    private boolean validEmail(final CharSequence charSequence) {
        return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }
}
