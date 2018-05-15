package com.example.actionfootballmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    String managerName,userName,password;
    DatabaseHelper myDB;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDB=new DatabaseHelper(this, "app");
        setContentView(R.layout.activity_register);
        register=(Button)findViewById(R.id.buttonRegister);
        login=(Button)findViewById(R.id.buttonLogin);

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
                EditText e = (EditText)findViewById(R.id.editTextManagername);
                managerName = e.getText().toString();
                e.setText("");

                EditText f = (EditText)findViewById(R.id.editTextUsername);
                userName = f.getText().toString();
                f.setText("");

                EditText b = (EditText)findViewById(R.id.editTextPassword);
                password = f.getText().toString();
                b.setText("");

                String[] vals = {managerName,userName,password};
                myDB.doUpdate("Insert into tournamentManager(managerName, userName, password) values (?,?,?);", vals);
                break;
        }
    }

    public void doRegister(View v){
    /* EditText e = (EditText)findViewById(R.id.editTextManagername);
		managerName = e.getText().toString();
		e.setText("");

		EditText f = (EditText)findViewById(R.id.editTextUsername);
		userName = f.getText().toString();
		f.setText("");

		EditText b = (EditText)findViewById(R.id.editTextPassword);
		password = f.getText().toString();
		f.setText("");

    	String[] vals = {managerName,userName,password};
    	myDB.doUpdate("Insert into tournamentManager(name, age, password) values (?,?,?);", vals);*/
    }
}
