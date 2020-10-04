package starters;

import java.util.ArrayList;
import java.util.List;

public class HomeWork5 {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,7,8,9};
        List<Integer> list=new ArrayList<Integer>();
        for(int i:a){
            list.add(i);
        }
//        System.out.println("for-each存值"+list);

//        for(int index=0;index<a.length;index++){
//            list.add(a[index]);
//        }
//        System.out.println("下标遍历存值"+list);

//        System.out.println("基于aslist方法"+Arrays.asList(a));

        Integer[] result=new Integer[list.size()];
//        System.out.println(list.toArray(result));
//        for(int i:result){
//            System.out.print(i+" ");
//        }

        result=(Integer[]) list.toArray(); //此方法报错，但是roy是可以强制转换的。
        for(int i:result){
            System.out.println(i);
        }
    }

}
