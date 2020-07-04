package org.example.collection;

import org.junit.Test;

import java.util.*;

public class TreeMapTest {
    class MyCollection implements Comparable<MyCollection> {
        private String name;
        private int count;
        public void setCount(int count) {
            this.count = count;
        }
        @Override
        public int compareTo(MyCollection o) {
            if (this.count > o.count) {
                return 1;
            } else if (this.count < o.count) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    @Test
    public void testComparable(){
        MyCollection m1 = new MyCollection();
        m1.setCount(25);
        MyCollection m2 = new MyCollection();
        m2.setCount(50);
        System.out.println(m1.compareTo(m2));
    }


    class IPNode{
        private String ip;
        private int count;
        IPNode(String i,int t){
            ip=i;
            count=t;
        }
        @Override
        public boolean equals(Object o){
            if(this==o){
                return true;
            }
            if(null==o){
                return false;
            }
            if(o instanceof IPNode){
                if(((IPNode) o).ip.equals(this.ip)){
                    return true;
                }
            }
            return false;
        }
        @Override
        public String toString(){
            return ip+":"+count;
        }
    }
    @Test
    public void testCompartor() {
       Comparator<IPNode> comparator=(a,b)->{
           return Integer.compare(a.count, b.count);
       };
        Map<IPNode,Object> map=new TreeMap<>(comparator.reversed());
        map.put(new IPNode("tian",10),null);
        map.put(new IPNode("di",20),null);
        map.put(new IPNode("ren",5),null);
        Iterator<IPNode> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
