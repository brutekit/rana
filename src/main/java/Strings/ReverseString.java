package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        StringBuffer sb2 = new StringBuffer();
//        sb.reverse();
        for(int i =s.length()-1 ; i >=0 ; i--){
            sb2.append(s.charAt(i));
        }
        System.out.println(sb2);
    }
}
