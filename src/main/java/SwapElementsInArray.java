public class SwapElementsInArray {
    public static void main(String[] args) {
        int[] arr= {5,8,2,6,4};

        for(int i = 0 ; i<arr.length ; i++) {
            int temp = arr[0];
            for (int j = 0; j <arr.length -1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;

            for(int k = 0 ; k<arr.length ; k++) {
                System.out.printf(arr[k]+" ");
            }
            System.out.println();
        }

    }
}
