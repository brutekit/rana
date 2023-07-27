package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCapital {
    public static void main(String[] args) {
        String s = "ashish rAna";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String[] split = s.split(" ");

        System.out.println(split[0].toUpperCase() +" "+split[1].toLowerCase());
    }
}
