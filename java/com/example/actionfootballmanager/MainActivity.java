package com.example.actionfootballmanager;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    DatabaseHelper myDB;
    Button logout,listManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDB=new DatabaseHelper(this, "app");
        setContentView(R.layout.activity_main);
        logout=(Button)findViewById(R.id.buttonLogout);
        listManager=(Button)findViewById(R.id.buttonList);

        logout.setOnClickListener(this);
        listManager.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonLogout:
                startActivity(new Intent(this,Login.class) );

                break;
            case R.id.buttonList:
                RelativeLayout l = (RelativeLayout) findViewById(R.id.relativeLayout);

                Cursor d = myDB.doQuery("SELECT managerName, userName from tournamentManager");
                while (d.moveToNext()){
                    TextView t = new TextView(this);
                    t.setText(d.getString(d.getColumnIndex("managerName"))+","+d.getLong(d.getColumnIndex("userName")));
                    l.addView(t);
                }
                d.close();
        }
    }


}
