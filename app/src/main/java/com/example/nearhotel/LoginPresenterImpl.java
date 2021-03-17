package com.example.nearhotel;

/**
 * Created by Ajinkya on 3/17/2021.
 */
public class LoginPresenterImpl implements LoginPresenter {

    // Presenter connects View and Model so put reference of both

    private LoginView loginView;
    private LoginModel loginModel;


    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModelImpl(this);
    }

    @Override
    public void onHandleLogin(String username, String password) {
        loginModel.validateUser(username,password);
    }

    @Override
    public void onSuccess() {
        loginView.onSuccess();
    }

    @Override
    public void onFailure() {

    }

    @Override
    public void onError(String error_message) {
        loginView.onError(error_message);
    }
}
