package com.example.truyendulieu;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText txtFullname,txtUsername,txtPassword,txtCondirmPwd;
    Button btnBack,btnSave;

    @Override
    protected void onCreate(Bundle SaveInstanceState){
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_register);

        txtFullname = findViewById(R.id.txt_reg_fullname);
        txtUsername = findViewById(R.id.txt_reg_username);
        txtPassword = findViewById(R.id.txt_reg_pass);
        txtCondirmPwd = findViewById(R.id.txt_reg_confirmpass);
        btnBack = findViewById(R.id.btBack);
        btnSave = findViewById(R.id.btSave);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();  }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = txtFullname.getText().toString();
                String username = txtUsername.getText().toString();
                String pwd = txtPassword.getText().toString();
                String confirmPwd = txtCondirmPwd.getText().toString();
                if (username.isEmpty() || !pwd.equals(confirmPwd)) {
                    Toast.makeText(RegisterActivity.this, "Check input again!!!", Toast.LENGTH_SHORT).show();
                    return;
                }//new nhap sai user name or pass va confirmpwd khong trung nhau thi kiem tra lai
                Intent intent = new Intent();
                //neu dung thi tao intent nao do de truyen du lieu nay sang Login
                intent.putExtra("fullname", fullname);
                intent.putExtra("username", username);
                intent.putExtra("pwd", pwd);
                intent.putExtra("confirmPwd", confirmPwd);
                //sau khi tao intent va dua du lieu toi dat ket qua vao LoginActivity
                setResult(LoginActivity.CODE, intent);
                finish();
            }
        });
        }
    }




