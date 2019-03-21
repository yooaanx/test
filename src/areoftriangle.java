import java.util.Scanner;

public class areoftriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideT = Double.parseDouble(scanner.nextLine());
        double hight = Double.parseDouble(scanner.nextLine());

        double area = sideT * hight / 2;

        System.out.printf("Triangle area = %.2f ", area);



    }
}
