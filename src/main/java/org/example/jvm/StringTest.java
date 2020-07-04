package org.example.jvm;

import com.sun.org.apache.xml.internal.utils.StringBufferPool;

public class StringTest {
    public static void Test1(){
        String t1="abc";
        String t2="abc";
        System.out.println(t1==t2);
        String t3=new String("abc");
        String t4=new String(t1);
        System.out.println(t1==t3);
        System.out.println(t1==t4);
        System.out.println(t3==t4);
        String t5=new StringBuilder("abc").toString();
        String t6=new StringBuilder(t1).toString();
        System.out.println(t1==t5);
        System.out.println(t1==t6);
        System.out.println(t5==t6);
        String t7="a"+"b"+"c";
        System.out.println(t1==t7);
        String t8="a"+new String("b")+"c";
        System.out.println(t1==t8);
    }
    public static void Test2(){
        String t1="abc";
        String t2="def";
        String t3="abcdef";
        String t4=t1+t2;
        String t5=t1+"def";
        System.out.println(t3==t4);
        System.out.println(t3==t5);
        System.out.println(t4==t5);
        String t6=""+"ghi";
        String t7="ghi";
        System.out.println(t6==t7);
        String t8="abc";
        final String t9="ab";
        String t10=t9+"c";
        System.out.println(t8==t10);
    }
    public static void main(String[] args) {
        String t1=new String("abcd");
        t1=t1.intern();
        String t2="abcd";
        System.out.println(t1==t2);
        String s1 = new StringBuilder("0").append("1").toString();
        System.out.println(s1.intern() == s1);  //返回true
        String s2 = new StringBuilder("0").toString();
        System.out.println(s2.intern() == s2);

        Test1();
        Test2();
    }
}
