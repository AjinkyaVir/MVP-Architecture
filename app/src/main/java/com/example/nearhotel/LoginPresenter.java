package com.example.nearhotel;

/**
 * Created by Ajinkya on 3/17/2021.
 */
public interface LoginPresenter {

    // After click on login button view call presenter

    void onHandleLogin(String username,String password);

    // view methods called by presenter

    void onSuccess();
    void onFailure();
    void onError(String error_message);


}
