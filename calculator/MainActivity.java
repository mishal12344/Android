package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText e1;
EditText e2;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        t1=(TextView)findViewById(R.id.t1);
        e1=(EditText)findViewById(R.id.n1);
        e2=(EditText)findViewById(R.id.n2);
    }

    public void add(View view) {
        String s1=e1.getText().toString();
        int num1=Integer.parseInt(s1);
        String s2=e2.getText().toString();
        int num2=Integer.parseInt(s2);

        int result=num1+num2;
        t1.setText(Integer.toString(result));


    }

    public void sub(View view) {
        String s1=e1.getText().toString();
        int num1=Integer.parseInt(s1);
        String s2=e2.getText().toString();
        int num2=Integer.parseInt(s2);

        int result=num1-num2;
        t1.setText(Integer.toString(result));

    }

    public void mult(View view) {
        String s1=e1.getText().toString();
        int num1=Integer.parseInt(s1);
        String s2=e2.getText().toString();
        int num2=Integer.parseInt(s2);

        int result=num1*num2;
        t1.setText(Integer.toString(result));

    }

    public void div(View view) {

        String s1=e1.getText().toString();
            int num1=Integer.parseInt(s1);
            String s2=e2.getText().toString();
            int num2=Integer.parseInt(s2);

            int result=num1/num2;
            t1.setText(Integer.toString(result));

        }
}