package org.example.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
//        int[] arr=new int[]{1,2,3};
//        List<Integer> list= IntStream.of(arr).boxed().collect(Collectors.toList());
//        System.out.println(list);
//        list.add(4);
//        System.out.println(list);
//
//        String[] arr2=new String[]{"a","b","c"};
//        List<String> list2= Stream.of(arr2).collect(Collectors.toList());
//        System.out.println(list2);
        Map<Integer,Integer> L=new ConcurrentHashMap<>();
        L.put(1,2);
    }

}
