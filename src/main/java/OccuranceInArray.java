
import java.util.*;
import java.util.stream.Collectors;

public class OccuranceInArray {

    //Program to find how many times variable Ouccrance in Array
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 3, 4, 1, 2, 5, 1};
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i,Collectors.counting())));


//        int count=0;
//        boolean skip;
//        for(int i=0 ; i < arr.length ; i++){
//            count = 1;
//            skip = false;
//
//            for (int j = i-1 ; j >=0 ; j--){
//                if (arr[i] == arr[j]) {
//                    skip = true;
//                }
//            }
//
//            if(skip == false) {
//                for (int j = 1 + i; j < arr.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        count++;
//                    }
//                }
//
//                System.out.println(arr[i] + " : " + count);
//            }
//        }
//
//        occurance(arr);
//        System.out.println("****************************************************");
//        occuranceWithHashMap(arr);
        }


    // number occurance in array without HashMap
        static void occurance(int[] arr){
            int count;
            int[] freq = new int[arr.length];
            int visited = -1;

            for (int i = 0; i < arr.length; i++) {
                count = 1;


                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = visited;
                    }
                }
                if (freq[i] != visited) {
                    freq[i] = count;
                }
            }
            for(int i=0; i<freq.length;i++){
                if(freq[i]!=visited){
                    System.out.println("number "+arr[i]+" comes : "+freq[i]+" times");
                }
            }
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" , ");
            }
            System.out.println("");
            for(int i=0;i<arr.length;i++) {
                System.out.print(freq[i]+" , ");
            }
        }

    // number occurance in array with HashMap
        static void occuranceWithHashMap(int[] arr){

            int count;
            Map<Integer,Integer> map = new HashMap<Integer, Integer>();

                for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                }
                else{
                map.put(arr[i],1);
                }
                }

                for(Map.Entry entry : map.entrySet()){

                System.out.println("number "+ entry.getKey()+" ouccers "+ entry.getValue()+" times");
                }
        }

    }


