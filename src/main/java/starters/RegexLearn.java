package starters;

public class RegexLearn {
    public static void main(String[] args) {
        String java="Java编程";

        String python="python编程";
        String programmingRegex=".{6,}编程";
        System.out.println(java.matches(programmingRegex));
        System.out.println(python.matches(programmingRegex));
    }
}
