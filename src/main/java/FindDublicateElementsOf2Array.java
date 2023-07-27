import java.util.HashSet;
import java.util.Set;

public class FindDublicateElementsOf2Array {
    public static void main(String[] args) {
        int[] arr1 = {23,44,6,7,44};
        int[] arr2 = {3,60,23,6,87,7};

        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr1.length ; i ++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length ; i ++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
            }
        }
    }
}
