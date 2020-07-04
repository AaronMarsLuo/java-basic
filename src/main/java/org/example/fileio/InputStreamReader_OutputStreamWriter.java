package org.example.fileio;

import java.io.*;

public class InputStreamReader_OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new FileInputStream("D://1.txt");
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        //查看编码
        System.out.println(inputStreamReader.getEncoding());
        int t;
        while((t=inputStreamReader.read())!=-1){
            System.out.println((char)t);
        }
        char[] m=new char[1024];
        while((inputStreamReader.read(m)!=-1)){
            System.out.println(m);
        }
        while((inputStreamReader.read(m,5,4)!=-1)){
            System.out.println(m);
        }
        inputStream.close();
        inputStreamReader.close();

        //可以自行定义输出流的模式，append为true则是追加模式，否则就是覆盖模式
        OutputStream outputStream=new FileOutputStream("D://1.txt",true);
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
        outputStreamWriter.write("现在是追加模式",0,4);
        outputStreamWriter.append("追加的内容");
        //如果不关闭记得要清空缓存区，才会进入文件中
        outputStreamWriter.flush();
        outputStream.close();
        //close会自动flush
        outputStreamWriter.close();

    }
}
