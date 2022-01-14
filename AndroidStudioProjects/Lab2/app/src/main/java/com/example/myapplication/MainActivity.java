package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btok;
    Button btexit;
    Button login;
    Button ac2;
    EditText pwd;
    EditText editt,user,pass;
    String test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btok=(Button)findViewById(R.id.btok);
        btexit=(Button)findViewById(R.id.btexit);
        login=(Button)findViewById(R.id.login);
        ac2=(Button)findViewById(R.id.ac2);
        btexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        ac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);
            }
        });
        btok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Hê lô các bạn",Toast.LENGTH_LONG).show();
                //kiemtra();
                ptbn();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dangnhap=(TextView)(findViewById(R.id.sum));
                user=(EditText)(findViewById(R.id.so1));
                pwd= (EditText) findViewById(R.id.pwd);
                test= user.getText().toString();
                if(user.getText().toString().equals("abc") && pwd.getText().toString().equals("123")){

                    dangnhap.setText(test);
                }else{
                    dangnhap.setText("Thông tin đăng nhập không chính xác");
                }
            }
        });
    }
    public void kiemtra(){
        editt=(EditText)(findViewById(R.id.so1));
        int a= Integer.parseInt(editt.getText().toString());

        if(a%2==0)
        {
            Toast.makeText(MainActivity.this,"So chan",Toast.LENGTH_LONG).show();
        }else Toast.makeText(MainActivity.this,"So le",Toast.LENGTH_LONG).show();
    }
    public void tong()
    {
        editt=(EditText)(findViewById(R.id.so1));
        int a= Integer.parseInt(editt.getText().toString());
        editt=(EditText)(findViewById(R.id.so2));
        int b= Integer.parseInt(editt.getText().toString());
        int c=a+b;
        Toast.makeText(MainActivity.this,"Tong 2 so la "+c,Toast.LENGTH_LONG).show();
        TextView sumhop=(TextView)(findViewById(R.id.sum));
        sumhop.setText(Integer.toString(c));
    }
    public void ptbn()
    {
        editt=(EditText)(findViewById(R.id.so1));
        int a= Integer.parseInt(editt.getText().toString());
        editt=(EditText)(findViewById(R.id.so2));
        int b= Integer.parseInt(editt.getText().toString());
        float c=(float)b/((float)-a);
        Toast.makeText(MainActivity.this,"Biến x là: "+c,Toast.LENGTH_LONG).show();
        TextView sumhop=(TextView)(findViewById(R.id.sum));
        sumhop.setText("PT: "+a+"x + "+b+"= 0 có x="+Float.toString(c));
    }
}