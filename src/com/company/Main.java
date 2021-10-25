package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1=new Student("1,Misha,Retin,PMIB,1");
        List<GroupSelected> groupSelectedList=new ArrayList<>();
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("1,Misha,Retin,PMIB,1"));
        studentList.add(new Student("2,Ivan,Ivanov,PMIB,3"));
        studentList.add(new Student("3,Ivana,Ivanova,PMIB,0"));
        for (int i=0;i<studentList.size();i++){
            if(studentList.get(i).getDolgCount()>0) groupSelectedList.add(new GroupSelected(studentList.get(i).toString()));
        }
        for (GroupSelected groupSelected:groupSelectedList)
            System.out.println(groupSelected.toString());
    }
}
