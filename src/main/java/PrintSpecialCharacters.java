public class PrintSpecialCharacters {
    public static void main(String[] args) {
        String s = "ab$%a93ir!#";
        int count=0;
        String newString = "";

        for(int i = 0 ; i < s.length() ; i++){
            if(!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
                count++;
            }else{
                newString += s.charAt(i);
            }
        }

        System.out.println(newString);
        System.out.println(count);
    }
}
