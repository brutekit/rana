import java.util.*;

public class PrintZerosFirstInArray {
    public static void main(String[] args) {

        int[] arr = {0,2,4,1,0,5,0,6,0,3,0,6,0};
        for(int  i =0 ; i < arr.length ; i++){
            if(arr[i] == 0 ){
                for(int j = i ; j>0 ; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = 0;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+", ");
        }

//        List<Integer> list = new LinkedList<>(Arrays.asList(2,4,1,0,5,6,0,3,6,0));
//        list.forEach(i -> System.out.print(i+", "));
//        int a = 0;
//        for(int i =0 ; i<list.size();i++){
//            if(list.get(i).equals(0)){
//                list.remove(i);
//                list.add(a, 0);
//                a++;
//            }
//        }
//        System.out.println();
//        list.forEach(i -> System.out.print(i+", "));

//
//        for(int i =0 ; i<arr.length;i++){
//            if(arr[i]== 0) {
//                for(int j = i ; j>0 ; j --){
//                    arr[j] = arr[j-1];
//                }
//                arr[a] = 0;
//                a++;
//            }
//        }
//
//        for(int i =0 ; i<arr.length;i++){
//            System.out.print(arr[i]+", ");
//        }
    }
}
