package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btn_loginLogin;
    private EditText et_username, et_password;
    private String name, password, namaReg, passwordReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_loginLogin = findViewById(R.id.btn_loginLogin);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);

        btn_loginLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
//                startActivity(intent);

                Intent intent = new Intent(Intent.ACTION_VIEW);

//                namaReg = intent.getStringExtra("varNama");
//                passwordReg = intent.getStringExtra("varPassword");

                name = et_username.getText().toString();
                password = et_password.getText().toString();

                if (name.trim().equals(""))
                {
                    et_username.setError("Nama masih kosong!!!");
                }
                else if (password.trim().equals(""))
                {
                    et_password.setError("Password masih kosong!!!");
                }
//                else if (name.trim().equals(namaReg) && password.trim().equals(passwordReg))
//                {
//                    intent.setData(Uri.parse("https://simponi2.mdp.ac.id/"));
//                    startActivity(intent);
//                }
                else
                {
                    intent.setData(Uri.parse("https://simponi2.mdp.ac.id/"));
                    startActivity(intent);

//                    et_username.setError("Username Salah!!!");
//                    et_password.setError("Password Salah!!!");
                }
            }
        });
    }
}