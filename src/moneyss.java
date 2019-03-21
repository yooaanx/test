import java.util.Scanner;

public class moneyss {
    private final static Double BITCOIN_LEV_VALUE = 1168d;
    private final static Double USD_LEV_VALUE = 1.76d;
    private final static Double YUAN_LEV_VALUE = 0.15 * USD_LEV_VALUE;
    private final static Double YUAN_USD_VALUE = 0.15;
    private final static Double EURO_LEV_VALUE = 1.95d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double bitCoin = 1;
        if (!checkNumberInInterval(bitCoin, 0d, 20d)) {
            System.out.println("failure bitCoin");
            return;
        }

        double yuan = 5;
        if (!checkNumberInInterval(yuan, 0d, 50000d)) {
            System.out.println("failure yuan");
            return;
        }

        double comissionNumber = 5;
        if (!checkNumberInInterval(bitCoin, 0d, 5d)) {
            System.out.println("failure comissionNumber");
            return;
        }

        double sumBitCoins = currencyConverterInBGN(bitCoin, BITCOIN_LEV_VALUE);
        double sumYuan = currencyConverterInBGN(yuan, YUAN_LEV_VALUE);
        double sumInLev = sumBitCoins + sumYuan;

        double euro = sumInLev / EURO_LEV_VALUE;


        double result = euro - (euro * (comissionNumber / 100));


        //double endValue = (sumInLev * (comissionNumber / 100) + sumInLev);


        System.out.printf("Your result = %.2f", result);

    }

    private static Double currencyConverterInBGN(Double amount, Double exchangeRate) {
        return amount * exchangeRate;
    }

    private static boolean checkNumberInInterval(Double number, Double min, Double max) {
        if (number > min && number <= max) {
            return true;
        }
        return false;
    }
}
