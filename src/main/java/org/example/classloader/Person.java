package org.example.classloader;

public class Person {
    private int age;
    private String name;
    private static String planet;
    public Person(){}
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPlanet(){
        return planet;
    }
    public static void setPlanet(){
        planet="earth";
    }
}
