package org.example.java8;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        Object objects=new Object();
        String str="what";
        Test test= System.out::println;
        System.out.println(test.getMy());
        System.out.println(test.getYour());
        test.getString(str);
    }
}
