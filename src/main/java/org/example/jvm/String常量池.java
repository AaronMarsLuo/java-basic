package org.example.jvm;

import java.util.Arrays;

public class String常量池 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();
        s.append("abc");
        s.append(new String("def"));
        String t1=s.toString();
    }
}
