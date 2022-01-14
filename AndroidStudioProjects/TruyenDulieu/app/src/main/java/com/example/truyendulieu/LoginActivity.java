package com.example.truyendulieu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity  extends AppCompatActivity {
    public static final int CODE =1;

    EditText txtUsername,txtPassword;
    Button btnRegister, btnLogin;

    String username = "",password = "", fullname = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsername = findViewById(R.id.txt_reg_username);
        txtPassword = findViewById(R.id.txt_reg_password);
        btnRegister = (Button)findViewById(R.id.btResgister);
        btnLogin = (Button)findViewById(R.id.btLogin);
        //dang ky su kien khi click regsiter & login0

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class );
                startActivityForResult(intent,CODE);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = txtUsername.getText().toString();
                String pwd = txtPassword.getText().toString();
                if(uname.equals(username) && pwd.equals(password)){
                    Toast.makeText( LoginActivity.this,"Welcome "+fullname,Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LoginActivity.this,"Login failed!!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case CODE://kiem tra dung chu ky
                //du lieu duoc tra ve tu RegisterActivity
                if (data != null){//co du lieu tu ben man hinh dang ky chuyen sang( boc bi thu ra)
                    fullname = data.getStringExtra("fullname");//lay ten
                    username = data.getStringExtra("username");//lay thu me gui
                    password = data.getStringExtra("pwd");//lay bang tot nghiep
                    }
                break;
            default:
                Toast.makeText(LoginActivity.this,"Error",Toast.LENGTH_SHORT).show();
                break;
                }
    }
}