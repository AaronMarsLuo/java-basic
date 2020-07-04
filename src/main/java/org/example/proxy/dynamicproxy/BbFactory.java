package org.example.proxy.dynamicproxy;

public class BbFactory implements WomanToolsFactory {
    @Override
    public void saleWomanTools(float length){
        System.out.println(length);
    }
}
