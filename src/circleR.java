import java.util.Scanner;

public class circleR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideR = Double.parseDouble(scanner.nextLine());

        double area = (sideR * sideR * Math.PI);
        double perimeter = (2 * Math.PI * sideR);


        System.out.println(String.format("area = %.2f ", area));

        System.out.println(String.format("perimeter = %.2f ", perimeter));

    }
}
