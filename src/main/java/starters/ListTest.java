package starters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<String>();
        myList.add("红烧牛肉");
        myList.add("烧烤茄子");
        myList.add("四川火锅");
        System.out.println(myList);
        myList.add(1,"老坛酸菜");
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        myList.remove("四川火锅");
        System.out.println(myList);
        myList.set(1,"碳烤生蚝");
        System.out.println(myList);
        System.out.println("----------基于下标遍历");
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }

        System.out.println("-----------基于foreach遍历");
        for(String s :myList){
            System.out.println(s);
        }

        System.out.println("-----iterator遍历");
        Iterator<String> s=myList.iterator();
        while (s.hasNext()){
            System.out.println(s.next());
        }

//        List<Integer>
    }
}
