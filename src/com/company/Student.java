package com.company;

import java.util.StringTokenizer;

public class Student {
    private int id_Student;
    private String firstName;
    private String lastName;
    private String id_Group;
    private int dolgCount;
    public  Student(String str){
        StringTokenizer stringTokenizer=new StringTokenizer(str,",");
        id_Student=Integer.parseInt(stringTokenizer.nextToken());
        firstName=stringTokenizer.nextToken();
        lastName=stringTokenizer.nextToken();
        id_Group=stringTokenizer.nextToken();
        dolgCount=Integer.parseInt(stringTokenizer.nextToken());
    }
    public int getDolgCount(){
        return dolgCount;
    }
    @Override
    public String toString(){
        return id_Student+","+firstName+","+lastName+","+id_Group;

    }
}
