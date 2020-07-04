package org.example.jvm;

public class StringPoolTest {
    public static void main(String[] args) {
        String str1,str2,str3;
        str1="a";
        str2="b";
        str3=str1+str2;
        StringBuilder sb=new StringBuilder("abc");
        sb=sb.append("567");
    }
}
