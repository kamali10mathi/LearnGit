package com.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
     static long popuation;

public Human( int age, String name, int salary, boolean married){
    this.age=age;
    this.name=name;
    this.married=married;
    this.salary=salary;
    Human.popuation +=1;
}

}
