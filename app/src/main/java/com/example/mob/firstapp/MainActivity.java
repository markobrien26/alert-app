package com.example.mob.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "messages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        final EditText username = (EditText)findViewById(R.id.usernameField);
        final EditText password = (EditText)findViewById(R.id.passwordField);

    }

    public void login(View view){

        final EditText username = (EditText)findViewById(R.id.usernameField);
        final EditText password = (EditText)findViewById(R.id.passwordField);

        if (username.getText().toString().contains("admin") &&
                                password.getText().toString().contains("admin")) {
            Intent i = new Intent(this, AlertHistory.class);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid details", Toast.LENGTH_LONG ).show();
        }

    }
}
