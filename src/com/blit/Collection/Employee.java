package com.blit.Collection;

public class Employee {

    static int count = 0;

    String name;
    int salary;

    String deptName;
    Employee(String name, String deptName, int salary){
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        count ++;

    }
//
//    void fun(){
//    }
}
