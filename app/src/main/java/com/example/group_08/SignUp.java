package com.example.group_08;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    private EditText userType, studentID, enterPassword, retypePassword;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userType       = findViewById(R.id.userTypeSignUpField);
        studentID      = findViewById(R.id.studentIDSignUpField);
        enterPassword  = findViewById(R.id.createPwSignUpField);
        retypePassword = findViewById(R.id.retypePwSignUpField);
        signUpButton   = findViewById(R.id.signUpButton);

        signUpButton.setOnClickListener(v -> {
            String type       = userType.getText().toString().trim();
            String id         = studentID.getText().toString().trim();
            String createPass = enterPassword.getText().toString().trim();
            String retypePass = retypePassword.getText().toString().trim();

            if (!type.equalsIgnoreCase("STUDENT") && !type.equalsIgnoreCase("TEACHER")) {
                userType.setError("Type STUDENT or TEACHER");
                userType.requestFocus();
                return;
            }
            if (id.isEmpty()) {
                studentID.setError("ID is required");
                studentID.requestFocus();
                return;
            }
            if (createPass.isEmpty()) {
                enterPassword.setError("Create a password");
                enterPassword.requestFocus();
                return;
            }
            if (retypePass.isEmpty()) {
                retypePassword.setError("Retype your password");
                retypePassword.requestFocus();
                return;
            }
            if (!createPass.equals(retypePass)) {
                retypePassword.setError("Passwords do not match");
                retypePassword.requestFocus();
                return;
            }

            startActivity(new Intent(SignUp.this, Dashboard.class));
            finish();
        });
    }
}