package count;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int count;
        int sum =0;
        for(int i =2 ;i<=100  ; i++) {
            count =0 ;
            for(int j=2; j<=i; j ++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 1){
                sum = sum + i ;
                System.out.print(i+", ");
            }
        }
        System.out.println("\n sum : "+sum);
    }
}
