import java.util.*;
public class RandomNumbers {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();
        int finalNumber = scanner.nextInt();
        int medium;



        if (startNumber > finalNumber){
            medium = finalNumber;
            finalNumber = startNumber;
            startNumber = medium;
        }
        if (startNumber == finalNumber){
            System.out.println(finalNumber);
        }


            for (int i = startNumber - 1; startNumber < finalNumber + 1; startNumber++) {


                System.out.println(GetRandom(startNumber, finalNumber));


            }


        }





private static int GetRandom (int min, int max){
    Random num = new Random();
    return num.nextInt((max - min) + 1) + min;
}
}