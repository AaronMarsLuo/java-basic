package org.example.collection;

public class Person {
    private String name;
    private int gender;
    private String nation;
    Person(){
        name="人";
    }
    public void getName(){
        System.out.println(name);
    }
    public void eat(){
        System.out.println("人吃东西");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }

    public static void main(String[] args) {
        Person person=new Student();
        Student stu=(Student)person;
        stu.eat();
        stu.read();
        stu.sleep();
        stu.getName();

        Person person1=new Person();
        Student stu1=(Student)person1;
        stu1.eat();
        stu1.sleep();
        stu1.read();
        stu1.getName();
    }
}

class Student extends Person{
    private String name;
    private int gender;
    private int num;
    Student(){
        name="学生";
    }
    @Override
    public void eat(){
        System.out.println("学生吃东西");
    }

    public void read(){
        System.out.println("学生读书");
    }
}
