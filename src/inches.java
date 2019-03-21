import java.util.Scanner;

public class inches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inches: ");

        double inches = Double.parseDouble(scanner.nextLine());
        double cantimeters =  inches*2.54;

        System.out.print("cantimters = "  + cantimeters);
    }
}
