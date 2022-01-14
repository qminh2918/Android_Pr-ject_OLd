package com.example.reg_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText fullname,username,password,confirm;
Button back,save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fullname=findViewById(R.id.ten);
        username=findViewById(R.id.username);
        password=findViewById(R.id.pass);
        confirm=findViewById(R.id.repass);
        back=findViewById(R.id.back);
        save=findViewById(R.id.register);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten=fullname.getText().toString();
                String user=username.getText().toString();
                String pwd=password.getText().toString();
                String cfm=confirm.getText().toString();
                if(user.isEmpty() || !pwd.equals(cfm))
                {
                    Toast.makeText(RegisterActivity.this,"Mật khẩu không khớp",Toast.LENGTH_LONG);
                    return;
                }
                Intent intent=new Intent();
                intent.putExtra("ten",ten);
                intent.putExtra("user",user);
                intent.putExtra("pwd",pwd);
                intent.putExtra("cfm",cfm);
                setResult(LoginActivity.CODE, intent);
                finish();
                }
        });
    }
}