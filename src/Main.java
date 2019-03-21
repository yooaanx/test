import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("side A = ");
        int sideA =  Integer.parseInt(scanner.nextLine());

        int area = sideA*sideA;

        System.out.printf("Square = " + area);
    }
}
