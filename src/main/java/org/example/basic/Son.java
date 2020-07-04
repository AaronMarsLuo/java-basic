package org.example.basic;

public class Son extends Father {
    public static String t1="Son";
    static {
        System.out.println(t1+"test2");
    }
    public static void print(){
        System.out.println(t1+"test1");
    }
    public Son(){
        System.out.println(t1+"test3");
    }

    public static void main(String[] args) {
        Son s=new Son();
        s.test();
    }
}
