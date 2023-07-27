public class StarPattern {

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(4);
//        pattern4(5);
        pattern5(5);



    }


    public static void pattern5(int n){
        for (int row = 1; row <n; row++) {

            for(int col=1; col<=row ; col++){
                System.out.print("* ");
            }
            for(int col=row; col<n; col++){
                System.out.print("  ");
            }
            for(int col=row; col<n; col++){
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <=n; row++) {

            for(int col=row; col<=n ; col++){
                System.out.print("* ");
            }
            for(int col=1; col<row; col++){
                System.out.print("  ");
            }
            for(int col=1; col<row; col++){
                System.out.print("  ");
            }
            for(int col=row; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern4(int n){

        for (int row = 1; row <=n*2; row++) {

            int numberOfRows = row>n ? n-(row-n): row;
            int numberOfSpace = n*2 - (numberOfRows+numberOfRows);

            for (int col = 1; col <=numberOfRows; col++) {
                System.out.print("* ");
            }

            for (int col = 1; col <=numberOfSpace; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <=numberOfRows; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void pattern3(int n){

        for (int row = 0; row <=(n*2); row++) {

            for (int col = 0; col <=(n*2) ; col++) {
                 int value = n  - Math.min( Math.min(row,col), Math.min((n*2)-row,(n*2)-col));

                System.out.print(value+" ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        int numberofCol = 0;
        int numberofSpace = 0;

        for (int row = 0; row < (n*2)-1 ; row++) {

            numberofCol = row>=n ?  (2*n - row) -2 :  row;

            numberofSpace = n-numberofCol;

            for (int col = 0; col <numberofSpace ; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col <=numberofCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        int numberofCol = 0;

        for (int row = 0; row < (n*2)-1 ; row++) {

            numberofCol = row>=n ?  (2*n - row) -2 :  row;

            for (int col = 0; col <=numberofCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
