import sun.font.FontRunIterator;

import java.util.*;
import java.util.regex.*;

public class OddOrEvenMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numstoParse = scanner.nextLine();

        Pattern findNums = Pattern.compile("\\d+");
        Matcher nums = findNums.matcher(numstoParse);

        List<Integer> numbers = new ArrayList<Integer>();

        int test = 0;

        while (nums.find()){

            numbers.add(Integer.parseInt(nums.group()));

        }
        String oddOrEven = ("Odd Numbers are: ");
        System.out.print(oddOrEven);
        for (int i = 0; i < numbers.size(); i++) {



            System.out.print(OddOrEven(numbers.get(i)));

            //System.out.print("Even Numbers are: %1$s", EvenorOdd(numbers.get(i)));
        }
        System.out.println();
        String evenorOdd = "Even numbers are: ";
        System.out.print(evenorOdd);
        for (int i = 0; i <numbers.size() ; i++) {

            System.out.print(EvenorOdd(numbers.get(i)));
        }



    }
    private static String OddOrEven(int num) {



        String parsedNumsLineOdd = " ";

        if (num % 2 != 0) {



            parsedNumsLineOdd = new String(" " + num);
        }

        return parsedNumsLineOdd;

    }
    private static String EvenorOdd(int num){


        String parsedNumEven = " ";

        if (num % 2 == 0){

            parsedNumEven = new String(" " + num);
        }
        return parsedNumEven;

    }
    }
