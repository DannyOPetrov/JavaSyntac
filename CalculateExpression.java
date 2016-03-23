import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double result1 = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / ((Math.pow(a, 2)) - Math.pow(b, 2))) , ((a + b + c )/Math.sqrt(c)));
        double result2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)) , (a - b));
        double average1 = (a + b + c) / 3;
        double average2 = (result1 + result2) / 2;
        double difference = average1 - average2;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", result1 , result2 , Math.abs(difference));
    }
}
