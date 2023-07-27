package Strings;

public class CharacterOccuranceInString {
    public static void main(String[] args) {
        String s = "ashaisaharana";
        long count = s.chars().filter(c -> c == 'a').count();
        System.out.println(count);
    }
}
