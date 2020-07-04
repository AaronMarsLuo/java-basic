package org.example.fileio;

import com.google.common.collect.Lists;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader_PrintWriter {
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("D://1.txt");
        BufferedReader bufferedReader=new BufferedReader(reader);
        String str;
        while ((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        List<Integer> list= Lists.newArrayList();
        //BufferedWriter bufferedWriter=new BufferedWriter(reader);
    }
}
