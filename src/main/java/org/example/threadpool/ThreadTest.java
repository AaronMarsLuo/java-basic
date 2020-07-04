package org.example.threadpool;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadLocal threadLocal=new ThreadLocal();
        Random random=new Random();

        ScheduledExecutorService pool= Executors.newScheduledThreadPool(5,Executors.defaultThreadFactory());
        for(;;) {
            for (int i = 0; i < 15; i++) {
                pool.execute(() -> {
                    threadLocal.set(random.nextInt());
                    System.out.println("random" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        }
    }
}
