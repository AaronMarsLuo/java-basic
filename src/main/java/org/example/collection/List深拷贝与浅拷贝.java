package org.example.collection;

import org.apache.commons.collections.CollectionUtils;

import java.util.*;

public class List深拷贝与浅拷贝 {
    public static void main(String[] args) {
        List<List<Integer>> oldList=new ArrayList<>();
        for(int i=0;i<5;i++){
            List<Integer> l=new ArrayList<>();
            l.add(i);
            oldList.add(l);
        }

        List<List<Integer>> newList=new ArrayList<>();
        CollectionUtils.addAll(newList,new Object[oldList.size()]);
        Collections.copy(newList,oldList);
        oldList.get(0).add(10);

        print(newList);
    }
    public static void print(List<List<Integer>> L){
        for (int i=0;i<L.size();i++){
            System.out.println(L.get(i));
        }
    }
}
