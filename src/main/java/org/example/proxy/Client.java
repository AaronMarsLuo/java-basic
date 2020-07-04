package org.example.proxy;

import org.example.proxy.staticproxy.AaFactory;
import org.example.proxy.staticproxy.ManToolsFactory;

public class Client {

    public static void main(String[] args) {

        ManToolsFactory factory=new AaFactory();
        //创建代理对象
        Lison lison=new Lison(factory);
        //实现代理服务
        lison.saleManTools("D");
    }
}
