package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Mom sujatha = new Mom();
        Mom selvi = new Mom();
        System.out.println(sujatha.weight);
        Mom terasa=new Mom();
        terasa.setWeight(88);
        terasa.getWeight();
//        Daughter obj2=new Daughter();
//        System.out.println(obj2.color);
//        Son obj3=new Son();
//        System.out.println(obj3.height+" " +obj3.weight+" "+obj3.color);
        sujatha.setWeight(49);
        sujatha.getWeight();
        selvi.setWeight(55);
        sujatha.setWeight(2,7);
        sujatha.getWeight();
        selvi.getWeight();
        selvi.setWeight(6,5);
        selvi.getWeight();

    }
}
