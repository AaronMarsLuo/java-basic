package org.example.bigdata;

import org.junit.Test;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TopCount {
    public void getTopCountByTreeMap(File file,int k) throws IOException {

        Map<String,Integer> map=new TreeMap();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String line;
        while((line=bufferedReader.readLine())!=null){
            if(map.containsKey(line)){
                int num=map.get(line);
                map.put(line,num+1);
            } else {
                map.put(line,1);
            }
        }
        Comparator<Map.Entry<String,Integer>> comparator= Map.Entry.comparingByValue();
        List<Map.Entry<String,Integer>> list=new ArrayList(map.entrySet());
        list.sort(comparator.reversed());
        System.out.println(list);
    }

    public void getTopCountByFile(File file,int k) throws IOException{
        AtomicInteger atomicInteger=new AtomicInteger();
    }

    @Test
    public void test() throws IOException {
        File file=new File("d://2.txt");
        getTopCountByTreeMap(file,3);
    }
}
