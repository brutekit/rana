package Strings;

import java.util.Arrays;

public class PrintAllPalandromesFromString {
    public static void main(String[] args) {
         String s = "MyM name is nitin and i am malam";
         String arr[] = s.split(" ");

        for(int i = 0 ; i < arr.length ; i ++){

            if(arr[i].contentEquals(reverse(arr[i]))){
                System.out.println(arr[i]);
            }
        }
    }

    public static StringBuffer reverse(String s){
        char c[] = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=c.length-1 ; i >= 0 ; i--){
            sb.append(c[i]);
        }
        return sb;
    }
}
