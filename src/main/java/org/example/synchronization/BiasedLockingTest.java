package org.example.synchronization;

import org.openjdk.jol.info.ClassLayout;

public class BiasedLockingTest {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}

class MyThread extends Thread {
    static Object object = new Object();
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (object) {
                System.out.println(Integer.toHexString(object.hashCode()));
                System.out.println(ClassLayout.parseInstance(object).toPrintable());
            }
        }

    }

}
