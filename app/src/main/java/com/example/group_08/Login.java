package com.example.group_08;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private EditText userType, studentID, password;
    private Button loginButton;
    private TextView signUpRedirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userType  = findViewById(R.id.userTypeLoginField2);
        studentID = findViewById(R.id.studentIDLoginField2);
        password  = findViewById(R.id.passwordLoginField2); // CHECK
        loginButton  = findViewById(R.id.loginButton);            // CHECK
        signUpRedirect  = findViewById(R.id.signUpRedirect);            // CHECK

        loginButton.setOnClickListener(v -> {
            String type = userType.getText().toString().trim();
            String id   = studentID.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if (!type.equals("STUDENT") && !type.equals("TEACHER")) {
                userType.setError("Type STUDENT or TEACHER (all caps)");
                userType.requestFocus();
                return;
            }
            if (id.isEmpty()) {
                studentID.setError("ID is required");
                studentID.requestFocus();
                return;
            }
            if (pass.isEmpty()) {
                password.setError("Password is required");
                password.requestFocus();
                return;
            }

            startActivity(new Intent(Login.this, Dashboard.class));
            finish();
        });

        signUpRedirect.setOnClickListener(v ->
                startActivity(new Intent(Login.this, SignUp.class))
        );
    }
}