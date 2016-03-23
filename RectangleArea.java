import java.util.*;
public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();
        int widht = scanner.nextInt();

        int rectangleArea = lenght * widht;

        System.out.println(rectangleArea);
    }
}
