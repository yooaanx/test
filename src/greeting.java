import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        double sideC = Double.parseDouble(scanner.nextLine());

        double area = (sideA + sideB)*sideC/2;

        System.out.println("area = " + area);

    }
}
