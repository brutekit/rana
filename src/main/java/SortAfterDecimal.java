import java.util.HashMap;
import java.util.Map;

public class SortAfterDecimal {
    public static void main(String[] args) {
        String[] str = {"45.7", "23.1", "78.2", "67.3"} ;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < str.length ; i++){
            String [] s = str[i].split("\\.");
            map.put(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }

        map.entrySet().stream().sorted((o1, o2) -> o1.getValue()- o2.getValue()).forEach(e -> System.out.println(e.getKey()+"."+e.getValue()));
    }
}
