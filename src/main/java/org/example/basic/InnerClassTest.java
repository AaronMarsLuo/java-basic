package org.example.basic;

public  class InnerClassTest {
      InnerClassTest(){

    }
    int t=1;
    public String t1="public";
    private String t2="private";
    protected String t3="protected";
    final String t4="final";
    static String t5="static";
    transient String t6="transient";
    volatile String t7="volatile";

    public  void  method1(){};
    public static void method2(){}
      class innerClass1{
        public int l1=1;
        public void print(){
            System.out.println(t2);
            System.out.println(t5);
            method1();
            method2();
        }
        //不能定义
        //static String t5="static";
        //public static void  print2(){}
    }

    abstract static class innerClass2{
        public int l1=1;
        public static int l2=2;
        public void print(){
            System.out.println(t5);
            method2();
        }
        public static void print2(){
            //不能访问非静态变量和方法
            //System.out.println(t7);
            //method1()
        }
    }

    public void method3(){
        abstract class innerClass3{
            public void print3(){
                System.out.println(t5);
            }
        }
    }
       Inner  innerClass4 = new Inner(){
        public void show() {
            System.out.println("show");
        }
        public void show2() {
            System.out.println("show2");
        }
    };

}

abstract class Inner {
    public abstract void show();
    public abstract void show2();
}