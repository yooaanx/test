import java.util.Scanner;

public class BuildBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int landingLeght = Integer.parseInt(scanner.nextLine());
        if (landingLeght < 1 ){
            System.out.println("failure");
            return;
        }
        else if (landingLeght > 100){
            System.out.println("failure");
        }

        double blockWidth = Double.parseDouble(scanner.nextLine());
        double blockLenght = Double.parseDouble(scanner.nextLine());
        if (blockLenght < 0.1) {
            System.out.println("failure");
            return;
        }
        else if (blockLenght > 10.00){
            System.out.println("failure");
            return;
        }
        else if (blockWidth < 0.1){
            System.out.println("failure");
            return;
        }
        else if (blockWidth > 10.00){
            System.out.println("failure");
            return;

        }


        int benchWidth = Integer.parseInt(scanner.nextLine());
        int benchLenght = Integer.parseInt(scanner.nextLine());
        if (benchLenght < 0 ){
            System.out.println("failure");
            return;
        }
        else if (benchLenght > 10){
            System.out.println("failure");
            return;
        }
        else if (benchWidth < 0){
            System.out.println("failure");
            return;
        }


        int sumLanding = landingLeght * landingLeght;

        int sumBench = benchLenght * benchWidth;

        int covarigeArea = sumLanding - sumBench;

        double blocksArea = blockLenght * blockWidth;

        double blocksNeeded = covarigeArea / blocksArea;

        double timeNeeded = blocksNeeded * 0.2;


        System.out.printf("Blocks needed: %.2f%n", blocksNeeded);
        System.out.printf("Time needed: %.2f", timeNeeded);

    }
}
