package com.example.basiclogins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText name;
    private EditText username;
    private EditText password;
    private EditText confirm;
    private EditText email;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        wireWidgets();
    }

    private void wireWidgets() {
        name = findViewById(R.id.editText_creataccountactivity_name);
        username = findViewById(R.id.editText_createaccountactivity_user);
        username.setText(getIntent().getStringExtra(LoginActivity.EXTRA_USERNAME));
        password = findViewById(R.id.editText_createaccountactivity_pass);
        confirm = findViewById(R.id.editText_createaccountdactivity_passconfirm);
        email = findViewById(R.id.editText_createaccountactivity_email);
        signup = findViewById(R.id.button_createaccountactivity_signup);
    }
}
