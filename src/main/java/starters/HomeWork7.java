package starters;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class HomeWork7 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String input=sc.nextLine();
//        System.out.println(checkMail(input));
        dataJson();

    }


    public static boolean checkMail(String  input){
        boolean result=false;
        String regex="\\w{3,16}@\\w{2,4}\\.(com|cn|edu)";
        if(input.matches(regex)){
            result=true;
        }
        return result;
    }

    public static void dataJson(){
        String ipStr="jQuery110207936645672700062_1601567698949({\"ResultCode\":\"0\",\"ResultNum\":\"1\",\"Result\":[{\"DisplayData\":{\"strategy\":{\"tempName\":\"ip\",\"precharge\":\"0\",\"ctplOrPhp\":\"1\"},\"resultData\":{\"tplData\":{\"srcid\":\"5809\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"query\":\"3.3.3.3\",\"origip\":\"3.3.3.3\",\"location\":\"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\"userip\":\"\",\"showlamp\":\"1\",\"tplt\":\"ip\",\"titlecont\":\"IP\\u5730\\u5740\\u67e5\\u8be2\",\"realurl\":\"http:\\/\\/www.ip138.com\\/\",\"showLikeShare\":\"1\",\"shareImage\":\"1\",\"data_source\":\"AE\"},\"extData\":{\"tplt\":\"ip\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\"}}},\"ResultURL\":\"http:\\/\\/www.ip138.com\\/\",\"Weight\":\"2\",\"Sort\":\"1\",\"SrcID\":\"5809\",\"ClickNeed\":\"0\",\"SubResult\":[],\"SubResNum\":\"0\",\"ar_passthrough\":[],\"RecoverCacheTime\":\"0\"}],\"QueryID\":\"2345259731\",\"Srcid\":\"5809\",\"status\":\"0\",\"data\":[{\"srcid\":\"5809\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"query\":\"3.3.3.3\",\"origip\":\"3.3.3.3\",\"location\":\"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\"userip\":\"\",\"showlamp\":\"1\",\"tplt\":\"ip\",\"titlecont\":\"IP\\u5730\\u5740\\u67e5\\u8be2\",\"realurl\":\"http:\\/\\/www.ip138.com\\/\",\"showLikeShare\":\"1\",\"shareImage\":\"1\"}]})";
        String ipfmStr=ipStr.substring(ipStr.indexOf("{"),ipStr.length()-1);
        JSONObject ipJson= JSON.parseObject(ipfmStr);
        Map<String ,Object > ipMap=new HashMap<>();
        for(String key:ipJson.keySet()){
            ipMap.put(key,ipJson.get(key));
        }
        System.out.println("map是：\n"+ipMap);

        Object datajson=ipMap.get("data");
//        System.out.println(datajson);

        //JsonArray
        JSONArray dataArray=(JSONArray)datajson;
        JSONObject dataJsonob=(JSONObject) dataArray.get(0);
//        System.out.println(dataJsonob);
        for(String s:dataJsonob.keySet()){
//            System.out.println(s+":"+dataJsonob.get(s));
        }

        //方法2：当做字符串处理
        String dataStr=datajson.toString();
//        System.out.println("转换后的data值的字符串是："+dataStr);
        String dataJsonStr=dataStr.substring(1,dataStr.length()-1);
        JSONObject dataStr2Json=JSON.parseObject(dataJsonStr);
        for(String s:dataStr2Json.keySet()){
            System.out.println(s+":"+dataJsonob.get(s));
        }
    }
}
