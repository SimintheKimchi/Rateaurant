package com.example.basiclogins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private Button signup;

    public static final String EXTRA_USERNAME = "the username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        wireWidgets();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "There's no login :P", Toast.LENGTH_SHORT).show();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendusername = new Intent(LoginActivity.this, CreateAccountActivity.class);
                String message = username.getText().toString();
                sendusername.putExtra(EXTRA_USERNAME, message);
                startActivity(sendusername);
            }
        });
    }

    private void wireWidgets() {
        username = findViewById(R.id.editText_loginactivity_user);
        password = findViewById(R.id.editText_loginactivity_pass);
        login = findViewById(R.id.button_loginactivity_login);
        signup = findViewById(R.id.button_loginactivity_singup);
    }
}
