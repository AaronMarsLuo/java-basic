package org.example.deadlock;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DeadLockTest {
    static class Account{
        double money;
        Account(double m){this.money=m;};
    }
    public static void transferMoney(Account from,Account to,double money) throws InsufficientResourcesException{
        synchronized (from){
            synchronized (to){
                if(from.money>money){
                    from.money-=money;
                    to.money+=money;
                } else{
                    throw new InsufficientResourcesException();
                }
            }
        }
    }
    public static void main(String[] args){
        Account account1=new Account(20.0);
        Account account2=new Account(40.0);
        Thread thread1=new Thread(){
            @Override
            public void run() {
                try {
                    transferMoney(account1,account2,10.0);
                } catch (InsufficientResourcesException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                try {
                    transferMoney(account2,account1,10.0);
                } catch (InsufficientResourcesException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        thread2.start();
        thread1.interrupt();
        Thread.interrupted();
        String s=null;
        final  String t="abc";
        List<Integer> list=new ArrayList<>();
        ListIterator<Integer> integerListIterator = list.listIterator();
        Runnable myrun=()->{
            System.out.println("temml");
        };
        Thread t1=new Thread(myrun);
    }

}

