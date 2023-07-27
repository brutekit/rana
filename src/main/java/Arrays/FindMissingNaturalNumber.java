package Arrays;

import java.util.Arrays;

public class FindMissingNaturalNumber {
    public static void main(String[] args) {
         int arr[] =  {1,2,3,4,5,6,7,8,9,10,12,13};  // 11 is missing
         int totalSum = (13*(13+1))/2;           //(n*(n+1) * 2
        int missingNumber = totalSum - Arrays.stream(arr).sum();
        System.out.println(missingNumber);
    }
}
