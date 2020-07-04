package org.example.proxy.dynamicproxy;

public interface WomanToolsFactory {
    default void tree(String string){
        System.out.println(string);
    }
    default void fasd(int t){
        System.out.println("afsdfa");
    }
    void saleWomanTools(float length);
}
