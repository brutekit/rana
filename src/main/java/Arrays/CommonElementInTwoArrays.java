package Arrays;

import java.util.*;

public class CommonElementInTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {4,66,87,21,98,101,1,3,66,34,21};
        Integer arr2[] = {22,87,4,10,21,55,1,1,21};

        Set<Integer> s = new HashSet<>();
        Arrays.stream(arr2).forEach(i -> s.add(i));

        for(int i=0 ; i< s.size(); i++) {
            if (s.contains(arr1[i])) {
                System.out.print(arr1[i] + " ");
            }
        }

    }
}
