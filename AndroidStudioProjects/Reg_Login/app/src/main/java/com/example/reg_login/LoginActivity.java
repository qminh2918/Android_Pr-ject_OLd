package com.example.reg_login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final int CODE =20;
    EditText username, pass;
    Button register,login;
    String ten ="",mk="",tdn="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        register= findViewById(R.id.btdangky);
        login= findViewById(R.id.btdangnhap);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,RegisterActivity.class);
                startActivityForResult(intent,CODE);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname= username.getText().toString();
                String pwd= pass.getText().toString();
                if(uname.equals(username)&& pwd.equals(pass)){
                    Toast.makeText(LoginActivity.this,"Dang nhap thanh cong"+ten,Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginActivity.this,"Dang nhap that bai",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    protected void onActivityResult(int requestcode, int resultcode, @Nullable Intent data) {

        super.onActivityResult(requestcode, resultcode, data);
        switch(requestcode){
            case CODE:
                if(data!=null){
                    ten=data.getStringExtra("ten");
                    tdn=data.getStringExtra("user");
                    mk=data.getStringExtra("pwd");
                }
                break;
        }
    }
}