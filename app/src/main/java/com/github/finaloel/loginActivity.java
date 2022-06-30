package com.github.finaloel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.service.autofill.UserData;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class loginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.log_user);
        password = findViewById(R.id.log_pass);
        login=findViewById(R.id.log_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("")  || password.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"Fill your Credentials first !!!",Toast.LENGTH_SHORT).show();
                    return;
                }


                Toast.makeText(getApplicationContext(),"Login Successful !!!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(loginActivity.this, UserprofileActivity.class);

                startActivity(intent);
                username.getText().clear();
                password.getText().clear();
            }
        });
    }

}