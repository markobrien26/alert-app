package com.example.mob.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "messages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        Button loginButton = (Button)findViewById(R.id.loginButton);
        final EditText username = (EditText)findViewById(R.id.usernameField);
        final EditText password = (EditText)findViewById(R.id.passwordField);

        loginButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View w){
                        if (username.getText().toString().contains("admin") &&
                                password.getText().toString().contains("admin")) {
                            setContentView(R.layout.activity_main2);
                        }
                    }
                }
        );
    }
}
