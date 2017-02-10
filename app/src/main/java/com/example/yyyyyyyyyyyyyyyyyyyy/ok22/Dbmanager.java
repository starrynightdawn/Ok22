package com.example.yyyyyyyyyyyyyyyyyyyy.ok22;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yyyyyyyyyyyyyyyyyyyy on 2016/12/25.
 */

public class Dbmanager {
    private DbHelper helper;
    private SQLiteDatabase db;
    public Dbmanager(Context context){
        helper = new DbHelper(context);
    }
    public void add(NewsTable newsTable){
        db = helper.getWritableDatabase();
        db.execSQL("insert into person(id,name) values (?,?)",new Object[]{newsTable.getId(),newsTable.getName()});}


    public List<NewsTable> getScrollData(int start, int count){
     List<NewsTable> newsTables = new ArrayList<NewsTable>();
        db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from person limit ?,?",new String[]{String.valueOf(start),String.valueOf(count)});
        while(cursor.moveToNext()){
            newsTables.add(new NewsTable(cursor.getInt(cursor.getColumnIndex("id")),cursor.getString(cursor.getColumnIndex("name"))));
        }
        return newsTables;
    }


    public long getCount()
    {
        db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select count(_id) from person",null);
        if(cursor.moveToNext()){
            return  cursor.getLong(0);
        }
        return 0;
    }
}
