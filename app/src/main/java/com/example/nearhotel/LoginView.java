package com.example.nearhotel;


/**
 * Created by Ajinkya on 3/17/2021.
 */
public interface LoginView {

    // after login button click update View

    void onSuccess();
    void onFailure();
    void onError(String error_message);

    // This method will update view




}
