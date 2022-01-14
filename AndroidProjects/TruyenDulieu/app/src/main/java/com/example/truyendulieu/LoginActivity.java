package com.example.truyendulieu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_REGISTER =1;
    EditText txtUsername,txtPassword;
    Button btnRegister, btnLogin;
    String username="",password="",fullname="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsername = findViewById(R.id.username);
        txtPassword = findViewById(R.id.username);
        btnRegister = findViewById(R.id.btn_register);
        btnLogin = findViewById(R.id.btn_login);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this, RegisterActivity.class);
                startActivityForResult(intent,REQUEST_CODE_REGISTER);
            }
        });
    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String uname = txtUsername.getText().toString();
            String pwd = txtPassword.getText().toString();
            if(uname.equals(username) && pwd.equals(password)){
                Toast.makeText(LoginActivity.this,"Welcome "+fullname,Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(LoginActivity.this,"Login false !!!",Toast.LENGTH_SHORT).show();
            }
        }
    });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case REQUEST_CODE_REGISTER:
                if(data!= null){
                    fullname = data.getStringExtra("fullname");
                    username = data.getStringExtra("username");
                    password = data.getStringExtra("pwd");
                }
                break;
        }
    }
}