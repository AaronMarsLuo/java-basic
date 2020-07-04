package org.example.collection;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.sun.deploy.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class list {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{(Integer)1,(Integer)2,(Integer)3};
        System.out.println("Integer[]转int[]");
        int[] arr1_1=Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        for (int i:arr1_1){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] arr1_2=ArrayUtils.toPrimitive(arr);
        for (int i:arr1_2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Integer[]转String[]");
        String[] arr1_3=Arrays.stream(arr).map(String::valueOf).toArray(String[]::new);
        for (String i:arr1_3){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Integer[]转String");
        String str1_2=Arrays.toString(arr);
        System.out.println(str1_2);
        List<Integer> list1=Lists.newArrayList(arr);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("List<Integer>转Integer[]");
        Integer[] arr11=list1.toArray(new Integer[]{});
        for (Integer i:arr11){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("List<Integer>转int[]");
        int[] arr12=list1.stream().mapToInt(Integer::intValue).toArray();
        for (int i:arr12){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("List<Integer>转String[]");
        String[] arr13=list1.stream().map(Objects::toString).toArray(String[]::new);
        for (String i:arr13){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("List<Integer>转List<String>");
        List<String> list11=list1.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(list11);
        System.out.println("List<Integer>转String");
        String str1=list1.toString();
        System.out.println(str1.substring(1,str1.length()-1));
        String str2=list1.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(str2);
        System.out.println("————————————————————————————————————————————————————");

        String[] arr2=new String[]{"a","b","c"};
        String[] arr2_=new String[]{"1","2","3"};
        System.out.println("String[]转int[]");
        int[] arr2_1=Stream.of(arr2_).mapToInt(Integer::parseInt).toArray();
        for (int i:arr2_1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("String[]转Integer[]");
        Integer[] arr2_2=Stream.of(arr2_).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        for (Integer i:arr2_2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("String[]转String");
        String str22=Arrays.toString(arr2_);
        System.out.println(str22);

        List<String> list2=Lists.newArrayList(arr2);
        System.out.println("List<String>转String[]");
        String[] arr21=list2.toArray(new String[]{});
        for (String i:arr21){
            System.out.print(i+" ");
        }
        System.out.println();
        List<String> list22=Lists.newArrayList(Arrays.asList("1","2","3"));
        System.out.println("List<String>转Integer[]");
        Integer[] arr22=list22.stream().mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        for (Integer i:arr22){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("List<String>转int[]");
        int[] arr23=list22.stream().mapToInt(Integer::parseInt).toArray();
        for (int i:arr23){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("List<String>转List<Integer>");
        List<Integer> list21=list22.stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        System.out.println(list21);
        System.out.println("List<String>转String");
        System.out.println(list2.toString());
        System.out.println(StringUtils.join(list2,""));
        System.out.println("————————————————————————————————————————————————————");

        int[] arr3=new int[]{1,2,3};
        System.out.println("int[]转Integer[]");
        Integer[] arr31=IntStream.of(arr3).boxed().toArray(Integer[]::new);
        for (Integer i:arr31){
            System.out.print(i+" ");
        }
        System.out.println();
        Integer[] arr32= ArrayUtils.toObject(arr3);
        for (Integer i:arr32){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("int[]转String[]");
        String[] arr33=Arrays.stream(arr3).boxed().map(String::valueOf).toArray(String[]::new);
        for (String i:arr33){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("int[]转String");
        String str32=Arrays.toString(arr3);
        System.out.println(str32);
        System.out.println("————————————————————————————————————————————————————");
        List<Integer> list3=Ints.asList(arr3);


        int i1=1;
        System.out.println("int转Integer");
        Integer I1=(Integer) i1;
        System.out.println(I1);
        System.out.println("int转String");
        String s1=String.valueOf(i1);
        System.out.println(s1);

        Integer I2=2;
        System.out.println("Integer转int");
        int i2=(int)I2;
        System.out.println(i2);
        int i3=I2.intValue();
        System.out.println(i3);
        System.out.println("Integer转String");
        String s2=I2.toString();
        System.out.println(s2);

        String s3="3";
        System.out.println("String转int");
        int i4=Integer.parseInt(s3);
        System.out.println(i4);
        System.out.println("String转Integer");
        Integer I3=Integer.parseInt(s3);
        System.out.println(I3);
    }
}
