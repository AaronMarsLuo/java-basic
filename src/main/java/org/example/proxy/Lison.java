package org.example.proxy;

import org.example.proxy.dynamicproxy.WomanToolsFactory;
import org.example.proxy.staticproxy.ManToolsFactory;

public class Lison implements ManToolsFactory, WomanToolsFactory {
    public ManToolsFactory factory;
    public WomanToolsFactory womanToolsFactory;
    Lison(ManToolsFactory factory){
        super();
        this.factory= factory;
    }

    @Override
    public void saleManTools(String size){
        //前置增强
        factory.saleManTools(size);
        //后置增强
    }

    @Override
    public void saleWomanTools(float length){
        //前置增强
        womanToolsFactory.saleWomanTools(length);
        //后置增强
    }
}
