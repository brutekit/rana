package count;

import java.util.HashMap;
import java.util.Map;

    public class WordOccuranceInString {
        public static void main(String[] args) {
            String s="Hi my name is Ashish my hobbies are reading";
            String[] strArray = s.split(" ");

            Map<String,Integer> map = new HashMap<>();

            for(String str : strArray){
                if(!map.containsKey(str)){
                    map.put(str,1);
                }else{
                    map.put(str,map.get(str) +1);
                }
            }

            map.forEach((k,v) -> System.out.println(k+" occured  "+v+" times"));
        }
}
