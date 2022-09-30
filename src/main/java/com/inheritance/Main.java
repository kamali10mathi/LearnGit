package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Mom sujatha = new Mom();
        Mom selvi = new Mom();
        System.out.println(sujatha.weight);
//        Daughter obj2=new Daughter();
//        System.out.println(obj2.color);
//        Son obj3=new Son();
//        System.out.println(obj3.height+" " +obj3.weight+" "+obj3.color);
        sujatha.setWeight(49);
        System.out.println(sujatha.getWeight());
        selvi.setWeight(55);
        sujatha.setWeight(2,7);
        System.out.println(sujatha.getWeight());
        System.out.println(selvi.getWeight());
        selvi.setWeight(6,5);
        System.out.println(selvi.getWeight());

    }
}
