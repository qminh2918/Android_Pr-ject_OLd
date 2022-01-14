package com.example.truyendulieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText txtFullname, txtUsername,txtPassword, txtConfirmPWd;
    Button btnBack, btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        txtFullname = findViewById(R.id.edt_fullname);
        txtUsername = findViewById(R.id.edt_username);
        txtPassword = findViewById(R.id.edt_password);
        txtConfirmPWd = findViewById(R.id.cfpassword);
        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_cf_register);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = txtFullname.getText().toString();
                String username = txtUsername.getText().toString();
                String pwd = txtPassword.getText().toString();
                String confirmPwd = txtConfirmPWd.getText().toString();

                if(username.isEmpty() || pwd.equals(confirmPwd)){
                    Toast.makeText(RegisterActivity.this,"Check inputs again !!!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("fullname",fullname);
                intent.putExtra("username",username);
                intent.putExtra("password",pwd);
                intent.putExtra("confirmPwd",confirmPwd);

                setResult(LoginActivity.REQUEST_CODE_REGISTER,intent);
                finish();

            }
        });


    }
}