package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateElements {
    public static void main(String[] args) {

        int arr[] = {1,4,5,6,7,4,7,8,9,9,2,1,3};

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e +" "));

        int j =0;

        for (int i = 0; i < arr.length -1 ; i++) {
            if(arr[i+1] != arr[i]){
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[arr.length-1];
        System.out.println();

        for (int i =0 ; i < j ; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
