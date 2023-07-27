package Strings;

public class ReverseStringUsingRecusion {

        public static void main(String[] args){
            String str = "ashish";
            System.out.println(reverseStr(str));
        }

        public static String reverseStr(String str){
            if(str.isEmpty())
                return str;
            else
                return  reverseStr(str.substring(1)) + str.charAt(0);
        }
}