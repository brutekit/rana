package Number;

public class PalandromeOfaNumber {
    public static void main(String[] args) {
         int num=6776;
         int temp= num;
         int rev =0;

         while(temp>0){
             rev = rev * 10;
             rev = rev + (temp%10);
             temp = temp /10 ;
         }
        System.out.println(rev==num);
    }
}
