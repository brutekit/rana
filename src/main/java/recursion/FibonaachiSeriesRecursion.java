package recursion;

public class FibonaachiSeriesRecursion {

    //Program to print Fibonaachi Series using recusrion

    static int a=0,b=1,c;
    public static void main(String[] args) {


        System.out.print("Fibonaachi Series : "+a+" "+b+" ");
        fibonaachiSeries(10);
    }

    static void fibonaachiSeries(int i){
        if(i>=1){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            fibonaachiSeries(i-1);
        }
    }
}
