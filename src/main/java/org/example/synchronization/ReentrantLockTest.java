package org.example.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    static ReentrantLock reentrantLock=new ReentrantLock();
    public static void main(String[] args) {
        Thread thread1=new Thread(){
            @Override
            public void run(){
                myRun();
            }
        };
        thread1.start();
    }
    public static void myRun(){
        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName());
        reentrantLock.unlock();
    }
}
