
public class ReverseString {

    //Program to reverse a string
    public static void main(String[] args) {
        String s = "Ashish Rana";
        reverseByUsingString(s);
        System.out.println("****************************************************");
        reverseByUsingStringBuffer(s);
    }



      static void reverseByUsingString(String s){
            String rev = "";

            for(int i = s.length()-1; i >= 0 ; i-- ){
                rev+= s.charAt(i);
            }
            System.out.println("Reverse string using String: "+ rev);
        }

    static void reverseByUsingStringBuffer(String s){

        System.out.println("Reverse string using StringBuffer: "+ new StringBuffer(s).reverse().toString());

    }
}