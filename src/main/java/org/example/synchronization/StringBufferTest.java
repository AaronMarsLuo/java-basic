package org.example.synchronization;


public class StringBufferTest {
    public static void main(String[] args) {
        Thread thread=new MyBufferThread();
    }
}

class MyBufferThread extends Thread{
    StringBuffer sb=new StringBuffer();
    @Override
    public void run() {
        sb.append("Thread:").append(this.getName());
    }
}
