public class Swap2numbers {
    public static void main(String[] args) {
        int a= 45, b=66;
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a+", "+b);
    }
}
