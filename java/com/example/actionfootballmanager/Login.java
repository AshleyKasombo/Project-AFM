package com.example.actionfootballmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button login,register;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.buttonLogin);
        register=(Button)findViewById(R.id.buttonRegister);
        username=(EditText)findViewById(R.id.editTextUsername);
        password=(EditText)findViewById(R.id.editTextPassword);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonLogin:

                startActivity(new Intent(this,MainActivity.class) );
                break;
            case R.id.buttonRegister:
                startActivity(new Intent(this,Register.class) );
                break;
        }
    }
}
