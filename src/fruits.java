import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bgnVegKG = Double.parseDouble(scanner.nextLine());
        //double bgnVegKG = -5;
        if (!checkNumberBetween(bgnVegKG)){
            System.out.println("failure!");
            return;
        }
        double bgnFruitKG = Double.parseDouble(scanner.nextLine());
        //double bgnFruitKG = 19.4;
        if (!checkNumberBetween(bgnFruitKG)){
            System.out.println("failure!");
            return;
        }

        //double sumVegKG = Double.parseDouble(scanner.nextLine());
        double sumVegKG = 10;
        if (!checkNumberBetween(sumVegKG)){
            System.out.println("failure!");
            return;
        }
        //double sumFruitKG = Double.parseDouble(scanner.nextLine());
        double sumFruitKG = 10;
        if (!checkNumberBetween(sumFruitKG)){
            System.out.println("failure!");
            return;
        }



        double bgnVeg = bgnVegKG * sumVegKG;
        double bgnFruit = bgnFruitKG * sumFruitKG;
        double bgnSumPrice = bgnFruit + bgnVeg;

        double BGNcurrancy = bgnSumPrice;

        double EURcurrancy = BGNcurrancy / 1.94;

        System.out.print(EURcurrancy);
    }

    private static boolean checkNumberBetween(Double num){
        double firstNumber = 0d;
        double secondNumber = 1000d;

        if (num >= firstNumber && num <= secondNumber){
            return true;
        }
        return false;
    }
}
