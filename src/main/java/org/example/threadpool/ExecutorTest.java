package org.example.threadpool;

import java.util.concurrent.*;

public class ExecutorTest {
    public static void main(String[] args) {
        //public ThreadPoolExecutor(int corePoolSize,
        //                              int maximumPoolSize,
        //                              long keepAliveTime,
        //                              TimeUnit unit,
        //                              BlockingQueue<Runnable> workQueue,
        //                              RejectedExecutionHandler handler)
        LinkedBlockingQueue<Runnable> blockingDeque=new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(5,10,20, TimeUnit.SECONDS,blockingDeque);

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });

        //ExecutorService executorService1=Executors.newScheduledThreadPool();

    }
}
