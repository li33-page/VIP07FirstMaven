package starters;

public class RegexTest {
    public static void main(String[] args) {
        String s="[1,2,3,4,5,6,7,8,9,0]";
//        s=s.replace('1','x');
//        System.out.println(s);
//        for(int i=1;i<6;i++){
//            s=s.replace(i+"","x");
//
//        }
//        System.out.println(s);

        String[] nos=s.split("[\\[,\\]]");
        for(String no :nos){
            System.out.println(no);
        }
    }
}
