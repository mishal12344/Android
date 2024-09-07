package com.example.loginpage1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
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
    }

    public void login(View view) {
        userName=findViewById(R.id.e1);
        password=findViewById(R.id.e2);
        String inputUsername = userName.getText().toString();
        String inputPassword = password.getText().toString();
        String user="Admin";
        String pass="Admin";
        if(inputUsername.isEmpty() || inputPassword.isEmpty()) {
            Toast.makeText(this, "Please fill the feilds", Toast.LENGTH_SHORT).show();
        }
        else if(inputPassword.equals(pass)&& inputUsername.equals(user)){
            Intent intent = new Intent(MainActivity.this,mainpage.class);
            startActivity(intent);

            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this, "Login Failed...!!!", Toast.LENGTH_SHORT).show();
        }
    }


    public void cancel(View view) {
       userName.setText("");
       password.setText("");

    }
}