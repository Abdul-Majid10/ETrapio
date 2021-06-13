package com.example.etrapio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText name, email, password;
    //private FirebaseAuth auth


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getSupportActionBar().hide();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void signup(View view){
        String userName = name.getText().toString();
        String userEmail = email.getText().toString();
        String userPassword= password.getText().toString();

        if(TextUtils.isEmpty(userName)){
            Toast.makeText(this, "Enter Name Please", Toast.LENGTH_SHORT).show();
            return;
        }

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

        Toast.makeText(this, "Successfully Register", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));

    }

    public void signin(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));

    }
}