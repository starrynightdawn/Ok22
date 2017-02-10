                                                                                                                                                                                                                                                                                                                                                              package com.example.yyyyyyyyyyyyyyyyyyyy.ok22;

                                                                                                                                                                                                                                                                                                                                                              import android.content.Intent;
                                                                                                                                                                                                                                                                                                                                                              import android.os.Bundle;
                                                                                                                                                                                                                                                                                                                                                              import android.support.v7.app.AppCompatActivity;
                                                                                                                                                                                                                                                                                                                                                              import android.view.View;
                                                                                                                                                                                                                                                                                                                                                              import android.widget.Button;

                                                                                                                                                                                                                                                                                                                                                              public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button menureturnbt = (Button)findViewById(R.id.menu_returnbt);
        Button menuaddbt = (Button) findViewById(R.id.menuAddbt);
        Button menuupdatebt = (Button) findViewById(R.id.menuUpdtbt);
        Button menudeletebt = (Button) findViewById(R.id.menuDeletebt);
        Button menunewsbt = (Button) findViewById(R.id.menuNewsbt);
        menunewsbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.setClass(Menu.this,News.class);
                startActivity(intent);
            }
        });
        menureturnbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.setClass(Menu.this,MainActivity.class);
                startActivity(intent);
            }
        });
        menuaddbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =getIntent();
                intent.setClass(Menu.this,AddInfo.class);
                startActivity(intent);
            }
        });
    }
}
