package org.example.basic;

public class Father {
    public static String t1="Father";
    static {
        System.out.println(t1+"test2");
    }
    public static void print(){
        System.out.println(t1+"test1");
    }
    public Father(){
        System.out.println(t1+"test3");
    }
    public void test(){
        System.out.println("FatherTest");
    }
}
