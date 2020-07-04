package org.example.java8;

public interface Test {
    default String getMy(){
        return "My";
    }
    default String getYour(){
        return "Your";
    }
    void getString(String str);

    @Override
    public boolean equals(Object obj);
}
