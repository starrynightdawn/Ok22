package com.example.yyyyyyyyyyyyyyyyyyyy.ok22;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class News extends AppCompatActivity {
    //ListView lvinfo = (ListView) findViewById(R.id.newsListView);
    //private void ShowInfo() {
        //ArrayAdapter<String> arrayAdapter = null;
       // Dbmanager dbmanagerInfo = new Dbmanager(News.this);
        //List<NewsTable> listInfo = dbmanagerInfo.getScrollData(0,(int) dbmanagerInfo.getCount());


        //String[] strinfos = new String[listInfo.size()];
        //int m = 0;
        //for (NewsTable newsTable:listInfo){
          //  strinfos[m] = newsTable.getId()+"|"+"+newsTable.getName+";
       //     m++;
       // }
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strinfos);
       // lvinfo.setAdapter(arrayAdapter);
    //}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_news);
       // ShowInfo();
        ListView newslv = (ListView) findViewById(R.id.newsListView);
        String[] newsinfo = new String[]{"成晓爽1","成晓爽2","成晓爽3"};
        //测试代码

         Dbmanager dbmanagerInfo = new Dbmanager(News.this);
        List<NewsTable> listInfo = dbmanagerInfo.getScrollData(0,(int) dbmanagerInfo.getCount());


        String[] strinfos = new String[listInfo.size()];
        int m = 0;
        for (NewsTable newsTable:listInfo){
          strinfos[m] = newsTable.getId()+"|"+newsTable.getName();
            m++;
         }


        ArrayAdapter<String> newarrayadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strinfos);
        newslv.setAdapter(newarrayadapter);
    }


}
