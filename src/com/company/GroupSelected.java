package com.company;

import java.util.StringTokenizer;

public class GroupSelected {
    private int id_Student;
    private String firstName;
    private String lastName;
    private String id_Group;

    public GroupSelected(String str){
        StringTokenizer stringTokenizer=new StringTokenizer(str,",");
        id_Student=Integer.parseInt(stringTokenizer.nextToken());
        firstName=stringTokenizer.nextToken();
        lastName=stringTokenizer.nextToken();
        id_Group=stringTokenizer.nextToken();
    }
    @Override
    public String toString(){
        return "++++++++++++++++++++++++++++"+
                "\n ID_Student: "+id_Student+
                "\n First_Name: "+firstName+
                "\n Last_Name: "+lastName+
                "\n ID_Group: "+id_Group;
    }
}
