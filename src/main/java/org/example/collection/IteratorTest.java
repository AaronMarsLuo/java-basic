package org.example.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator it = list.iterator();
//        while(it.hasNext()){
//            list.remove(2);
//            System.out.println(it.next());
//        }
        int t = 1;
        while (it.hasNext()) {
            if (t == 3) {
                it.remove();
            }
            System.out.println(it.next());
            t++;
        }

        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        Vector<Integer> vector = new Vector<>(15, 20);
        System.out.println(vector.size());
        System.out.println(vector.capacity());
        for (int i = 0; i < 16; i++) {
            vector.add(i);
        }
        System.out.println(vector.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.iterator();
        Stack<Integer> stack = new Stack<>();
        stack.iterator();
        System.out.println("---------------------------HashMap----------------");
        My m1 = new My("luomin", "what");
        My m2 = new My("luomin", "set");
        Map<My,String> map=new HashMap<>();
        map.put(m1,"ni");
        map.put(m2,"wo");
        map.keySet().iterator();
        map.entrySet().iterator();
        System.out.println(map.size());
        System.out.println(map.get(m1));
        map.put(new My("sdj","sf"),"fsd");
        Iterator<My> iterator1 = map.keySet().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Iterator<String> iterator2 = map.values().iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        Iterator<Map.Entry<My, String>> iterator3 = map.entrySet().iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        Map<Integer,Integer> map2=new LinkedHashMap<>();
        Map<Integer,Integer> map3=new TreeMap<>();
        map3.entrySet();
        Map<Integer,Integer> map4=new Hashtable<>();
        ConcurrentHashMap<Integer,Integer> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.keySet().iterator();

        System.out.println("---------------------------HashSet----------------");
        Set<My> set = new HashSet<>();

        System.out.println(m1.hashCode() == m2.hashCode());
        set.add(m1);
        set.add(m2);
        System.out.println(m1.equals(m2));
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.iterator();
        Set<Integer> set2 = new TreeSet<>();
        SortedSet<Integer> set3 = new TreeSet<>();

        Queue<Integer> queue=new ConcurrentLinkedQueue<>();
    }
}

class My {
    String name;
    String user;

    My(String n, String u) {
        name = n;
        user = u;
    }

    @Override
    public String toString(){
        return this.name+"  "+this.user;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        if (object instanceof My) {
            return ((My) object).name==this.name;
        }
        return true;
    }
}
