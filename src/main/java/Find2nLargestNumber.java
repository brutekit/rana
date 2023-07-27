import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find2nLargestNumber {
    public static void main(String[] args) {
        int arr[] = {10, 12,20, 20, 4,6,8,12};
        List<Integer> list  = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
//        findSecondLargestElement(arr);
//        System.out.println(getSecondLargest(arr, arr.length));
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst());
    }

    static void findSecondLargestElement(int[] arr){

        Arrays.sort(arr);
        System.out.println( "Second largest element in array : " + arr[arr.length-2]);

    }


    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
}

