package starters;

public class DotRegexText {

    public static void main(String[] args) {
        String dot="....编程";
        String java="java编程";
        String python="python编程";
        String jjjj="jjjj编程";

//        String regex="\\.{4}编程";
        String regex="(java|python)编程";
        System.out.println(python.matches(regex));
        System.out.println(java.matches(regex));


    }
}
