import java.util.*;

public class SevenBase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();

        Integer numberToSeven = Integer.valueOf(number, 7);

        System.out.println(numberToSeven);
    }
}
