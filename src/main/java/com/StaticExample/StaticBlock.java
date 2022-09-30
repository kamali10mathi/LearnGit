package com.StaticExample;

public class StaticBlock {
    static  int a=2;
    static int b=5;

    static {
        System.out.println(" I am a Static");
        b=a * b;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);

        StaticBlock.b +=3;
        StaticBlock obl2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);


    }
}
