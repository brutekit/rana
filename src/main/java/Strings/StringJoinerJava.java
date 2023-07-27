package Strings;

import java.util.StringJoiner;

public class StringJoinerJava {
    public static void main(String[] args) {
//        a,b,c
//        d:e
//        a,b,c,d:e

        StringJoiner sb1 =  new StringJoiner(",","[","]");
        sb1.add("a").add("b").add("c");
        System.out.println(sb1);

        StringJoiner sb2 =  new StringJoiner(":");
        sb2.add("d").add("e");
        System.out.println(sb2);

        sb1.merge(sb2);
        System.out.println(sb1);
    }
}
