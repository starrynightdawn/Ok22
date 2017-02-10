package com.example.yyyyyyyyyyyyyyyyyyyy.ok22;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yyyyyyyyyyyyyyyyyyyy on 2016/12/22.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DBNAME = "account.db";
    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public DbHelper(Context context){
        super(context,DBNAME,null,VERSION);

    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table person(_id integer primary key autoincrement,id integer,name varchar(20))";
        //创建数据库时先新建一个表
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "update student...";
        //更新数据库时执行的操作
        db.execSQL(sql);

    }
}
