package starters;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    //存储容器是set  类型是String
//    Set<String> mySet=new HashSet<String>();
//    Set<String> mySet=new HashSet<String>();
//    mySet
//    Set<String> roySet=new HashSet<String>();

    /**
     * set list map可以通过sout直接输出内容。容器对象已经帮我们处理好，不是输出类型和地址。
     * @param args
     */
    public static void main(String[] args) {
        Set<String> mySet=new HashSet<String>();
//        增
        mySet.add("和颜悦色");
        mySet.add("喜茶");
        mySet.add("双双");
        mySet.add("郁可coco");
//        查
        System.out.println(mySet);
        //删
        mySet.remove("喜茶");
        System.out.println(mySet);
        //set没有下标，没有重复的数据。
//        遍历
        for(String s:mySet){
//            System.out.println(s+"好喝");
        }
        System.out.println("------迭代器输出------");

        Iterator<String> mysit=mySet.iterator();
//        while ()
        while (mysit.hasNext()){
            System.out.println(mysit.next());
        }
    }

}
