package recursion;

public class FactorialRecursion {

    //Program to print factorial using recusrion
    public static void main(String[] args) {

        System.out.println("factorial : "+fact(5));
    }

    static int fact(int i){
        if(i<1)
            return 1;
        else
            return fact(i-1)*i;

    }
}
