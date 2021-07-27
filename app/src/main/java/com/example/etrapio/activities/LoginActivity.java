package com.example.etrapio.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.etrapio.R;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void signIn(View view) {

        String userEmail = email.getText().toString();
        String userPassword= password.getText().toString();


        if(TextUtils.isEmpty(userEmail)){
            Toast.makeText(this, "Enter Email Please", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(userPassword)){
            Toast.makeText(this, "Enter Password Please", Toast.LENGTH_SHORT).show();
            return;
        }

        if(userPassword.length()<6){
            Toast.makeText(this, "Password too Short. Enter minimum 6 characters", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void singUp(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));

    }
}