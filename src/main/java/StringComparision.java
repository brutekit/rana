public class StringComparision {
    public static void main(String[] args) {
        String s1= "india";
        String s2= "india";
        String s3 = new String("india");
        String s4 = s3;

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1==s2);  // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1==s3); // false
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3==s4); // true
    }
}
