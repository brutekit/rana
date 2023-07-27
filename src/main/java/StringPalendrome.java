public class StringPalendrome {
    public static void main(String[] args) {
        String s1 = "pikip";
        String s2 ="";
        for(int i = s1.length()-1  ; i >=0 ; i--){
            s2 += s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println(s2+" is palendrome");
        }
//        String s2 = reverse(s1);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(reverse(567876541));
//        StringBuffer sb = new StringBuffer(str);
//        sb.reverse();
//
//        if(str.equals(sb.toString())){
//            System.out.println("String is palendrome");
//        }else{
//            System.out.println("String is Not palendrome");
//        }


//        for (int i = 0; i <= str.length(); i++) {
//
//            for (int j = 0 + i; j <= str.length(); j++) {
//                System.out.print(" " + str.substring(i, j));
//            }
//        }
    }

    static String reverse(String str) {
            char[] c = str.toCharArray();
            char[] rev = new char[c.length];
            int i = c.length-1, j=0;
        while(i >= 0){
            rev[j] = c[i];
            i--;
            j++;
        }
            return String.valueOf(rev);
        }

        static Integer reverse(Integer num){
        int rev=0;
        int rem;
        while(num!=0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
        }

}
