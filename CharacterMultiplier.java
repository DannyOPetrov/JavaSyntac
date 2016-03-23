import java.util.Scanner;

/**
 * Created by 112-pc on 20.3.2016 г..
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String str1 = scan.next();
            String str2 = scan.next();

            int sum = 0;
            if (str1.length() == str2.length()) {
                for (int i = 0; i < str1.length(); i++) {
                    sum+=(int)str1.charAt(i)*(int)str2.charAt(i);
                }
                System.out.println(sum);
            }
            if (str1.length()>str2.length()){
                for (int i = 0; i < str2.length(); i++) {
                    sum += (int) str1.charAt(i) * (int) str2.charAt(i);
                    for (int j = str2.length(); j < str1.length(); j++) {
                        sum += (int) str1.charAt(j);
                    }
                }
                System.out.println(sum);
                } else if(str1.length()<str2.length()){
                for (int i = 0; i < str1.length(); i++) {
                    sum += (int) str1.charAt(i) * (int) str2.charAt(i);
                    for (int j = str1.length(); j < str2.length(); j++) {
                        sum += (int) str2.charAt(j);
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
