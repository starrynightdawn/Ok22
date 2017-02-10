package com.example.yyyyyyyyyyyyyyyyyyyy.ok22;

/**
 * Created by yyyyyyyyyyyyyyyyyyyy on 2016/12/25.
 */

public class NewsTable {
    private String name;
    private int id;
    public NewsTable(){
        super();
    }
    public NewsTable(int id,String name){
        super();
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
