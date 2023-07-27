import java.util.*;
import java.util.stream.Collectors;

public class given3SortedArray {
    public static void main(String[] args) {
        Integer[] arr1 = {8,15,19,88,89};

        Integer[] arr2 ={1,9,21,23,33};

        Integer[] arr3 = {22,44,66,88,110};

        List<Integer> list = new ArrayList<>( Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        list.addAll(Arrays.asList(arr3));
        Collections.sort(list);

        System.out.println(list.stream().sorted((o1, o2) -> o2-o1).collect(Collectors.toList()));
        System.out.println(list.stream().sorted((o1, o2) -> o2-o1).skip(4).findFirst().get());

        System.out.println(list.get(list.size()-5));
    }
}
