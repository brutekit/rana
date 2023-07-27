public class StringIsCyclic {
    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        if((s1+s1).contains(s2)){  // this  will check  ABCDABCD contians CDAB
            System.out.println("String is Cyclic");
        }else{
            System.out.println("String is Not Cyclic");
        }
    }
}
