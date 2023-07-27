import java.util.HashMap;
import java.util.Map;

public class Analogy {
    public static void main(String[] args) {
            String s1 = "shishsap";
            String s2 = "apsshish";

            Map<Character,Integer> map1 = new HashMap<>();
            Map<Character,Integer> map2 = new HashMap<>();

            for(int i = 0 ; i < s1.length() ; i++){
                if(map1.containsKey(s1.charAt(i))){
                    map1.put(s1.charAt(i) , map1.get(s1.charAt(i))+1);
                }else {
                    map1.put(s1.charAt(i),1);
                }
            }

            for(int i = 0 ; i < s2.length() ; i++){
                if(map2.containsKey(s2.charAt(i))){
                    map2.put(s2.charAt(i) , map2.get(s2.charAt(i))+1);
                }else {
                    map2.put(s2.charAt(i),1);
                }
            }

            System.out.println(map1);
            System.out.println(map2);


            if(map1.equals(map2)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
    }
}
