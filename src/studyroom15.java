import java.util.Scanner;

public class studyroom15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double roomHight = 15;
        double roomWideth = 8.9;

        double workBench = 1.1 * 2;

        int couridorH =  1;
        double door = 1.6;
        double catedra = 1.6 * 1.2;

        double roomSpace = roomHight*roomWideth;
        double sumWorkBench = roomSpace / workBench;

        System.out.print(sumWorkBench);








    }
}
