package com.inheritance.organisation;

public class Main {
    public static void main(String[] args) {
        Employee mathi= new Employee();
        Employee kamali = new Employee();
        System.out.println(mathi.salary);
        System.out.println(mathi.leaveBalance);
        mathi.setSalary(1222222);
        System.out.println(mathi.getSalary());
        kamali.setSalary(22222);
        System.out.println(kamali.getSalary());

    }


}
