package starters;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> scoreMap=new HashMap<String, Integer>();
        scoreMap.put("病态",90);
        scoreMap.put("roy",60);
        scoreMap.put("李姗姗",100);
        scoreMap.put("roy",55);
        scoreMap.put("蜗牛",90);
        System.out.println(scoreMap);
        scoreMap.replace("roy",99);
//        System.out.println(scoreMap);
//        scoreMap.remove("病态");
//        System.out.println(scoreMap);
//        scoreMap.remove("roy",88);
        System.out.println(scoreMap);

        //没有下标
        for(String s:scoreMap.keySet()){
            System.out.print(s+"分数是:"+scoreMap.get(s)+"\n");
        }
        System.out.println();
//        for(Integer i:scoreMap.values()){
//            System.out.print(i+"  ");
//        }
        System.out.println("----------使用entryset方法-----");
        for(Entry<String,Integer> en:scoreMap.entrySet()){
            System.out.println(en);
        }
        System.out.println("-------迭代器----");
        Iterator mit=scoreMap.keySet().iterator();
        while (mit.hasNext()){
            System.out.println(mit.next());
        }

    }}
