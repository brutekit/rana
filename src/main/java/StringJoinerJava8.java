import java.util.StringJoiner;

public class StringJoinerJava8 {
    public static void main(String[] args) {
        StringJoiner str = new StringJoiner(",","[","]");
        str.add("a");
        str.add("b");
        str.add("c");
        StringJoiner str2 = new StringJoiner(":");
        str2.add("p");
        str2.add("q");
        str.merge(str2);
        System.out.println(str); // [a,b,c,p:q]

    }
}
