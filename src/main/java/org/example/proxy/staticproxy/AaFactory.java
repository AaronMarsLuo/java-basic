package org.example.proxy.staticproxy;

//真实对象
public class AaFactory implements ManToolsFactory {
    @Override
    public void saleManTools(String size){
        System.out.println(size);
    }
}
