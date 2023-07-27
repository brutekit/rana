public class LeapYear {
    public static void main(String[] args) {
//        int year = 2008;
        for(int year = 1900; year < 2050 ; year++) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + ", ");
            }
        }
    }
}
