package com.example.yyyyyyyyyyyyyyyyyyyy.ok22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button maincomeintobt =  (Button) findViewById(R.id.MainComeintobt);
        maincomeintobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_main1 = new Intent(MainActivity.this, Menu.class);
                startActivity(intent_main1);
            }
        });
    }
}
