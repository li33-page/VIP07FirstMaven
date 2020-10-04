package starters;

public class StringUse {
    public static void main(String[] args) {
        String s="wherethereisawill,thereisaway";
//        System.out.println(s.equals("yos"));
//        System.out.println("roy".equals(s));
//        System.out.println(s.contains("r"));
//        System.out.println(s.length());
//        System.out.println(s.replace('r','a'));
//        System.out.println(s.replace("oy","ose"));
        System.out.println(s.length());
        System.out.println(s.substring(1, s.length()-6));
        System.out.println(s.substring(20));

        StringBuffer sb=new StringBuffer();
        sb.append("roy");
        sb.append("teacher");
        System.out.println(sb);
        String re=sb.reverse().toString();
        System.out.println(re);
    }
}
