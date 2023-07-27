public class Substring {

    //Program to find all substrings of string
    public static void main(String[] args) {


        String str = "abcd";
        for (int i = 0; i <= str.length(); i++) {

            for (int j = 0 + i; j <= str.length(); j++) {
                System.out.print(" " + str.substring(i, j));
            }
        }
    }
}
