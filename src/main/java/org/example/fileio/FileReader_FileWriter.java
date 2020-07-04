package org.example.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D://1.txt");
        FileReader fileReader1 = new FileReader("D://1.txt");
        //1.读单个字符
        int t;
        while ((t = fileReader.read()) != -1) {
            System.out.println((char) t);
        }
        //2.读固定长度
        char[] buff = new char[1024];
        int num;//读取的长度
        while ((num = fileReader1.read(buff)) != -1) {
            System.out.println(buff);
        }
        fileReader.close();
        fileReader1.close();

        //append参数为true表示追加模式，否则就是覆盖模式
        FileWriter fileWriter = new FileWriter("D://1.txt");
        fileWriter.write("现在是覆盖模式");
        fileWriter.append("append是追加模式");
        //一定要flush才能生效
        fileWriter.flush();
        fileWriter.close();
        FileWriter fileWriter1 = new FileWriter("D://1.txt", true);
        fileWriter1.write("即便write也是追加模式");
        fileWriter1.write("append永远都是追加模式");
        fileWriter1.flush();
        fileWriter1.close();

    }
}

