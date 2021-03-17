package com.example.nearhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView{
                                            // For view interface MainActivity is impl class
    EditText mUsername,mPassword;
    Button mLogin;

    // View calls presenter make presenter reference
    LoginPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = findViewById(R.id.edtUsername);
        mPassword = findViewById(R.id.edtPassword);
        mLogin = findViewById(R.id.btnLogin);

        presenter = new LoginPresenterImpl(this);


        // Learn Interface of MVP architecture
        // For view , presenter, model we impl interface

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.onHandleLogin(mUsername.getText().toString(),mPassword.getText().toString());
            }
        });

    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Next Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure() {

    }

    @Override
    public void onError(String error_message) {
        Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
    }
}