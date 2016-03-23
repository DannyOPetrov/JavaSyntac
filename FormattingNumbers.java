import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.*;
import java.lang.*;
public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer firstNum = scanner.nextInt();
        Double secondNum = scanner.nextDouble();
        Double thirdNum = scanner.nextDouble();

        String TheFirstNum = firstNum.toHexString(firstNum);
        String FirstNumByte = Integer.toBinaryString(firstNum);

        String padding = "0000000000";
        String resultbit = padding + FirstNumByte;
        resultbit = resultbit.substring(resultbit.length() - 10, resultbit.length());

        NumberFormat secNum = new DecimalFormat("#0.00");
        NumberFormat thirdNumber = new DecimalFormat("#0.000");

        String finalSecond = secNum.format(secondNum);
        String finalThird = thirdNumber.format(thirdNum);








        System.out.println(resultbit);
        System.out.println(TheFirstNum.toUpperCase());
        System.out.println(secNum.format(secondNum));
        System.out.println(thirdNumber.format(thirdNum));



       // System.out.println(MessageFormat.format("{0} {1} {2} {3}", TheFirstNum.toUpperCase(), resultbit, secNum.format(secondNum), thirdNumber.format(thirdNum)));

        String theFinalFinalResultFinally = String.format("|%1$-10s| |%2$-10s| |%3$10s| |%4$-10s|", TheFirstNum.toUpperCase(),
                resultbit, finalSecond, finalThird);
        System.out.println(theFinalFinalResultFinally);


    }
}
