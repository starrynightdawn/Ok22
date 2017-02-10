package com.example.yyyyyyyyyyyyyyyyyyyy.ok22;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText AddInfo_addidet = (EditText) findViewById(R.id.addidet);
        final EditText Addinfo_addnameet = (EditText) findViewById(R.id.addnameet);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button addreturnbt = (Button)findViewById( R.id.addreturnbt);
        addreturnbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =getIntent();
                intent.setClass(AddInfo.this,Menu.class);
                startActivity(intent);
            }
        });
        final EditText addnameet = (EditText)findViewById(R.id.addnameet);
        Button addtruebt = (Button)findViewById(R.id.addtruebt);
        final EditText addidet = (EditText)findViewById(R.id.addidet);
        addtruebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //String addid = addidet.getText().toString();
              Dbmanager dbmanager =new Dbmanager(AddInfo.this);

               int id =Integer.parseInt(AddInfo_addidet.getText().toString());
                String name = Addinfo_addnameet.getText().toString();
               NewsTable newsTable = new NewsTable(id,name);
               dbmanager.add(newsTable);
                Toast.makeText(AddInfo.this,"新增信息插入成功",Toast.LENGTH_SHORT).show();

            }
        });
    }


}
