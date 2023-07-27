package count;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayNumberOccurance {
    public static void main(String[] args) {
        int[] arr= {2,4,6,7,6,5,4,4,6};

        List list = Arrays.asList(arr);

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
               map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map.entrySet().stream().min((o1, o2) -> o1.getValue() - o2.getValue()).get().getKey());
        map.forEach((k,v) -> System.out.println(k+" occured "+v+" times"));
    }
}
