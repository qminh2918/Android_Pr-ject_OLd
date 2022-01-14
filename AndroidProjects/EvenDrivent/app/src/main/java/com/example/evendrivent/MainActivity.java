package com.example.evendrivent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonExit, buttonOk,buttonTong;
    EditText editText,editText2;
    TextView editTextTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOk=(Button)findViewById(R.id.buttonOk);
        buttonExit=(Button)findViewById(R.id.buttonExit);
        buttonTong =(Button)findViewById(R.id.buttonTong);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiemtra();
            }
        });
        buttonTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tong();
            }
        });
    }
    public void kiemtra() {
        editText = (EditText)(findViewById(R.id.editText));
    int i= Integer.parseInt(editText.getText().toString());
    if(i%2==0){
        Toast.makeText(MainActivity.this,"La so chan",Toast.LENGTH_LONG).show();
    }else{
        Toast.makeText(MainActivity.this,"La so le",Toast.LENGTH_LONG).show();
    }
    }

    public  void Tong() {
        editText = (EditText)(findViewById(R.id.editText));
        editText2 = (EditText)(findViewById(R.id.editText2));
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());
        int tong = a+b;
        editTextTong = (TextView) findViewById(R.id.editTong);

        editTextTong.setText(tong);
    }
}