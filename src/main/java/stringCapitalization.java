

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringCapitalization {
    // by using StringUtils or Character.toUpperCase or substring() method
    public static void main(String[] args) {
        String str= "hello my name is ashish rana";
        List list = Arrays.asList("my","rana");

        String[] strArray =str.split(" ");
        for(String s  : strArray){
            if(!list.contains(s)) {
                s = Character.toUpperCase(s.charAt(0)) + s.substring(1) ;
            }
            System.out.print(s+" ");
        }

//        for(String s  : strArray){
//            if(!list.contains(s)){
//               s =  s.substring(0, 1).toUpperCase() + s.substring(1);
//            }
//            System.out.print(s+" ");
//        }

//        for(String s  : strArray){
//            if(!list.contains(s))
//                s = StringUtils.capitalize(s);
//
//            System.out.print(s+" ");
//        }
    }
}
