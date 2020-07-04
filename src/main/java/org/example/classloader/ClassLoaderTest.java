package org.example.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Student person=new Student();
        //反射方法1: 对象.getClass
        Class class1=person.getClass();

        //反射方法2: 类名.class
        Class class2=Person.class;

        //反射方法3: Class.forName(类的全路径)
        Class class3=Class.forName("org.example.classloader.Student");
        //类的名称
        System.out.println("类的名称："+class3.getName());
        //父类的名称
        System.out.println("父类名称："+class3.getSuperclass().getName());
        //public构造方法
        Constructor[] constructors = class3.getConstructors();
        System.out.println("public构造方法数量："+constructors.length);
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        //public构造方法
        Constructor[] constructors1 = class3.getDeclaredConstructors();
        System.out.println("所有构造方法数量："+constructors1.length);
        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }
        //public方法
        Method[] methods = class3.getMethods();
        System.out.println("public方法数量："+methods.length);
        for (Method method : methods) {
            System.out.println(method);
        }
        //所有成员方法
        Method[] declaredMethods = class3.getDeclaredMethods();
        System.out.println("所有成员方法："+declaredMethods.length);
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        //public成员变量
        Field[] fields = class3.getFields();
        System.out.println("public成员变量："+fields.length);
        for (Field field : fields) {
            System.out.println(field);
        }
        //所有成员变量
        Field[] declaredFields = class3.getDeclaredFields();
        System.out.println("所有成员变量："+declaredFields.length);
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //public内部类
        Class[] classes = class3.getClasses();
        System.out.println("public内部类："+classes.length);
        for (Class aClass : classes) {
            System.out.println(aClass.getName());
        }

        //所有内部类
        Class[] declaredClasses = class3.getDeclaredClasses();
        System.out.println("所有内部类："+declaredClasses.length);
        for (Class aClass : declaredClasses) {
            System.out.println(aClass.getName());
        }

    }
}


