import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int Ax = console.nextInt();
        int Ay = console.nextInt();
        int Bx = console.nextInt();
        int By = console.nextInt();
        int Cx = console.nextInt();
        int Cy = console.nextInt();

        int area =(Ax*(By-Cy) + Bx*(Cy-Ay) + Cx*(Ay-By))/2;
        System.out.println(Math.abs(area));
    }
}
