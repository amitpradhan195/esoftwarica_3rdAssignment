package com.example.esoftwarica.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.esoftwarica.R;

public class LoginActivity extends AppCompatActivity {
    public EditText etUsername, etPassword;
    public Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText)findViewById(R.id.username);
        etPassword = (EditText)findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(etUsername.getText().toString() != "softwarica" || etPassword.getText().toString() != "coventry"){
//                    Toast.makeText(LoginActivity.this, "Invalid Username or Password", Toast.LENGTH_LONG).show();
//                    etUsername.requestFocus();
////                    return;
//                }
//                    LoginActivity.this.startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                    LoginActivity.this.finish();
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
