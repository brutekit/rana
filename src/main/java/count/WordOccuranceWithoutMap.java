package count;

public class WordOccuranceWithoutMap {

    public static void main(String[] args) {

            String[] str = {"red","black", "red","yellow","red","yellow"};
            int count= 0;
            boolean flag=true;

            for(int i = 0; i< str.length;i++) {
                flag = true;
                count = 0;

                for (int k = i - 1; k >= 0; k--) {
                    if (str[i].equals(str[k])) {
                        flag = false;
                    }
                }

                if (flag) {
                    for (int j = i; j < str.length; j++) {
                        if (str[j].equals(str[i])) {
                            count++;
                        }
                    }
                    System.out.println(str[i] + " occured " + count + " time");
                }
            }

        }
}
