package com.inheritance;

public class Mom {

        int weight=44;
        String color="brown";
        String age;

    public void getWeight() {
        System.out.println(weight);
    }
    public void setWeight(int a){
        weight=a;
    }
    public void setWeight(int a,int b){
        weight =a+b;
    }
}



