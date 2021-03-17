package com.example.nearhotel;

import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by Ajinkya on 3/17/2021.
 */
public class LoginModelImpl implements LoginModel {

    // It will update presenter so put reference of presenter
    private LoginPresenter loginPresenter;

    public LoginModelImpl(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void validateUser(String username, String password) {
        if (TextUtils.isEmpty(username))
           loginPresenter.onError("Please enter username");
        else if (TextUtils.isEmpty(password))
            loginPresenter.onError("Please enter password");
        else if (password.length() < 4)
            loginPresenter.onError("Enter Valid Password");
        else
            loginPresenter.onSuccess();
    }

}
