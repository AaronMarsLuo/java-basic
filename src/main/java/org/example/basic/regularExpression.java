package org.example.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
    public static void main(String[] args) {
        //1.替换
        String str1="whadk2s@qq.com";
        String regex1="\\w+@";
        Pattern pattern1=Pattern.compile(regex1);
        Matcher matcher1=pattern1.matcher(str1);
        String str1_=matcher1.replaceAll("163");
        System.out.println(str1_);
        String str1_1=str1.replaceAll(regex1,"buct");
        System.out.println(str1_1);
        System.out.println("--------");
        //2.分割
        String str2="ljo,fdsjk,sdfs,sdfsa,sfd@163.com";
        String regex2="\\w,";
        Pattern pattern2=Pattern.compile(regex2);
        String[] list2=pattern2.split(str2);
        for (String i:list2){
            System.out.print(i+" ");
        }
        System.out.println();
        String[] list2_=str2.split("\\w,");
        for (String i:list2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------");
        //3.一次匹配
        String str3="aaabbb";
        String regex3="a*b*";
        Boolean isMatch=Pattern.matches(regex3,str3);
        System.out.println(isMatch);
        System.out.println("--------");
        //4.多次匹配
        String str4="<a>123</a><a>456</a><a>789</a>";
        String regex4="/(?<=<a>)\\w+(?=</a>)/mg";
        Pattern pattern4=Pattern.compile(regex4);
        Matcher matcher4=pattern4.matcher(str4);
        while(matcher4.find()){
            System.out.println(matcher4.group());
        }
    }
}
