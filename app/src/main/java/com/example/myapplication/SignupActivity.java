package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    private Button btn_signUp;
    private EditText et_username, et_email, et_password, et_confirmPassword;
    private String username, email, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn_signUp = findViewById(R.id.btn_SignUpRegister);
        et_username = findViewById(R.id.et_usernameRegister);
        et_email = findViewById(R.id.et_emailRegister);
        et_password = findViewById(R.id.et_passwordRegister);
        et_confirmPassword = findViewById(R.id.et_confirmPassword);

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = et_username.getText().toString();
                email = et_email.getText().toString();
                password = et_password.getText().toString();
                confirmPassword = et_confirmPassword.getText().toString();

                if (username.trim().equals(""))
                {
                    et_username.setError("Masukkan Nama!!!");
                }
                else if (email.trim().equals(""))
                {
                    et_email.setError("Masukkan Email!!!");
                }
                else if (password.trim().equals(""))
                {
                    et_password.setError("Masukkan Password!!!");
                }
                else if (confirmPassword.trim().equals(""))
                {
                    et_confirmPassword.setError("Masukkan Confirm Password!!!");
                }
                else if (password.equals(confirmPassword))
                {
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    intent.putExtra("varNama", username);
                    intent.putExtra("varPassword", password);
                    startActivity(intent);
                }
                else
                {
                    et_password.setError("Tidak Sama!!!");
                    et_confirmPassword.setError("Tidak Sama!!!");
                }

//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://mdp.ac.id"));
//                startActivity(intent);
            }
        });
    }
}