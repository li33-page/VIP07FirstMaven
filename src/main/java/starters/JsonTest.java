package starters;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonTest {
    public static void main(String[] args) {
        String ipStr="jQuery110207936645672700062_1601567698949({\"ResultCode\":\"0\",\"ResultNum\":\"1\",\"Result\":[{\"DisplayData\":{\"strategy\":{\"tempName\":\"ip\",\"precharge\":\"0\",\"ctplOrPhp\":\"1\"},\"resultData\":{\"tplData\":{\"srcid\":\"5809\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"query\":\"3.3.3.3\",\"origip\":\"3.3.3.3\",\"location\":\"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\"userip\":\"\",\"showlamp\":\"1\",\"tplt\":\"ip\",\"titlecont\":\"IP\\u5730\\u5740\\u67e5\\u8be2\",\"realurl\":\"http:\\/\\/www.ip138.com\\/\",\"showLikeShare\":\"1\",\"shareImage\":\"1\",\"data_source\":\"AE\"},\"extData\":{\"tplt\":\"ip\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\"}}},\"ResultURL\":\"http:\\/\\/www.ip138.com\\/\",\"Weight\":\"2\",\"Sort\":\"1\",\"SrcID\":\"5809\",\"ClickNeed\":\"0\",\"SubResult\":[],\"SubResNum\":\"0\",\"ar_passthrough\":[],\"RecoverCacheTime\":\"0\"}],\"QueryID\":\"2345259731\",\"Srcid\":\"5809\",\"status\":\"0\",\"data\":[{\"srcid\":\"5809\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"query\":\"3.3.3.3\",\"origip\":\"3.3.3.3\",\"location\":\"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\"userip\":\"\",\"showlamp\":\"1\",\"tplt\":\"ip\",\"titlecont\":\"IP\\u5730\\u5740\\u67e5\\u8be2\",\"realurl\":\"http:\\/\\/www.ip138.com\\/\",\"showLikeShare\":\"1\",\"shareImage\":\"1\"}]})";
        String ipfmStr=ipStr.substring(ipStr.indexOf("{"),ipStr.length()-1);
        JSONObject ipJson=JSON.parseObject(ipfmStr);
//        System.out.println(ipJson);
        Map<String ,Object > ipMap=new HashMap<>();
        for(String key:ipJson.keySet()){
            ipMap.put(key,ipJson.get(key));
        }
        System.out.println("map是：\n"+ipMap);
        System.out.println("**************555*******************************");

        String convertStr="{";
        for(String key:ipMap.keySet()){
            String keyPart="\""+key+"\"";
            String maohao=":";
            String valuePart="";
            if(ipMap.get(key) instanceof String){
             valuePart="\""+ipMap.get(key)+"\"";}
            else{
             valuePart=ipMap.get(key).toString();}
            convertStr+=keyPart+maohao+valuePart+",";
            System.out.println(keyPart+maohao+valuePart);



        }            System.out.println("*********************************************");
        convertStr+="}";
        convertStr=convertStr.replace(",}","}");
        System.out.println(convertStr);
    }
}
