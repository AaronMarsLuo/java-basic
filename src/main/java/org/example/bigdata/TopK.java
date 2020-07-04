package org.example.bigdata;

import org.junit.Test;

import java.io.*;
import java.util.*;

public class TopK {

    /**
     * 选出前k大的数（比如选出前50大的数）
     * 1.一次性读入后排序，直接用list下标找出排序前k大的数，存入list时间n，排序logn，提取前k个数时间k
     * 2.一次性读入后放到TreeMap中，用红黑树保存，建树时间n*logn 提取出前k个数时间k
     * 3.分批读入，维护一个大小为K的最小堆，这样读完了之后最后留下来的就是top k了，如果要bottom k就维护最大堆，缺点是会有重复值
     *   建队时间n*logk，拿出前k个数时间k
     * 4.为了去重，分批读入，维护一个大小为k的有序list，每次插入利用二分查找看是否包含，若包含就舍弃，若不包含就先插入，然后删除第一个数，
     * list会把1~size()-1的值拷贝到0~size()-2，读数n，每次进来二分查找logk，然后拷贝数组是k，所以一共是n*k
     */
    //内存可存储，数组不变，一次性处理，选出第k大的数，复杂度logn
    public List getTopKNumByList(File file, int k) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(file));
        List<Integer> list=new ArrayList<>();
        String line;
        while ((line=reader.readLine())!=null){
            list.add(Integer.parseInt(line));
        }
        list.sort(Comparator.reverseOrder());
        List<Integer> subList = new ArrayList<>(list.subList(0, k));
        return subList;
    }
    public List getTopNumByTreeMap(File file, int k) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(file));
        Map<Integer,Object> map=new TreeMap<>(Comparator.reverseOrder());
        String line;
        while ((line=reader.readLine())!=null){
            map.put(Integer.parseInt(line),null);
        }
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = map.keySet().iterator();
        List<Integer> list=new ArrayList<>();
        while(iterator.hasNext() && k>0){
            list.add(iterator.next());
            k--;
        }
        return list;
    }
    public List getTopKByStack(List<File> files, int k) throws IOException {
        Queue<Integer> queue=new PriorityQueue<>(k);
        for (File file : files) {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line;
            while ((line=reader.readLine())!=null){
                int num=Integer.parseInt(line);
                if(queue.size()<k){
                    queue.add(num);
                } else if(num>queue.peek()){
                    queue.remove();
                    queue.add(num);
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext() && k>=0){
            list.add(iterator.next());
            k--;
        }
        list.sort(Comparator.reverseOrder());
        return list;
    }
    public List getTopKByListDividually(List<File> files,int k) throws IOException {
        //因为是先插再删，防止list扩容
        List<Integer> list=new ArrayList<>(k+1);
        for (File file : files) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                String result=binarySearch(list,num);
                String flag=result.split("\\+")[0];
                int index=Integer.parseInt(result.split("\\+")[1]);
                if(flag.equals("false")){
                    list.add(index,num);
                    if(list.size()>k){
                        list.remove(list.size()-1);
                    }
                }
            }
        }
       return list;
    }
    private String binarySearch(List<Integer> list,int n){
        int low=0;
        int high=list.size()-1;
        while(low<=high){
            int mid=low+((high-low)>>>1);
            if(list.get(mid)<n){
                high=mid-1;
            } else if(list.get(mid)>n){
                low=mid+1;
            } else {
                return "true+"+mid;
            }
        }
        return "false+"+low;
    }
    @Test
    public void testTopK() throws IOException{
        File file=new File("d://1.txt");
        System.out.println(getTopKNumByList(file,10));
        System.out.println(getTopNumByTreeMap(file,10));
        List<File> files=new ArrayList<>();
        files.add(file);
        System.out.println(getTopKByStack(files,10));
        System.out.println(getTopKByListDividually(files,10));

    }
}