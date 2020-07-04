package org.example.synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
   static int num=0;
   private static AtomicInteger atomicInteger=new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable=()->{
//            for (int i = 0; i < 1000; i++) {
//                num=num+1;
//            }
//        };
//        List<Thread> threadList=new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            Thread thread=new Thread(runnable);
//            thread.start();
//            threadList.add(thread);
//        }
//
//        Thread.sleep(2000);
//        System.out.println(num);

        Runnable runnable=()->{
            for (int i = 0; i < 1000; i++) {
               atomicInteger.incrementAndGet();
            }
        };
        List<Thread> threadList=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread=new Thread(runnable);
            thread.start();
            threadList.add(thread);
        }
        Thread.sleep(2000);
        System.out.println(atomicInteger.get());

    }
}
