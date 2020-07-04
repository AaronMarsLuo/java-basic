package org.example.synchronization;

import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;


public class ObjectHeaderTest {
    class Person{
        private int age;
        private boolean isStudent;
        int t;
        protected String what;
    }
    @Test
    public void test(){
        Object[] obs={};
        System.out.println(ClassLayout.parseInstance(obs).toPrintable());
        Person person=new Person();
        //打印对象头信息
        System.out.println(ClassLayout.parseInstance(person).toPrintable());
        synchronized (person){
            System.out.println(ClassLayout.parseInstance(person).toPrintable());
        }
    }
    @Test
    public void test2(){
        Person person=new Person();
        //打印对象头信息
        System.out.println(ClassLayout.parseInstance(person).toPrintable());
        synchronized (person){
            System.out.println(ClassLayout.parseInstance(person).toPrintable());
        }
    }
    @Test
    public void test3(){
        Person person=new Person();
        //打印对象头信息
        System.out.println(ClassLayout.parseInstance(person).toPrintable());
        synchronized (person){
            System.out.println(ClassLayout.parseInstance(person).toPrintable());
        }
        System.out.println(Integer.toHexString(person.hashCode()));
        //System.out.println(System.identityHashCode(person));
        synchronized (person){
            System.out.println(ClassLayout.parseInstance(person).toPrintable());
        }

    }
    @Test
    public void test4() throws InterruptedException {
        Person person=new Person();
        System.out.println(ClassLayout.parseInstance(person).toPrintable());
        synchronized (person){
            Thread.sleep(1000);
            System.out.println(ClassLayout.parseInstance(person).toPrintable());
        }
        System.out.println(Integer.toHexString(person.hashCode()));
        synchronized (person){
            Thread.sleep(1000);
            System.out.println(ClassLayout.parseInstance(person).toPrintable());
        }
        //System.out.println(System.identityHashCode(person));
    }
}

