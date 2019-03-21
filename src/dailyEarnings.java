import java.util.Scanner;

public class dailyEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthDays = Integer.parseInt(scanner.nextLine());
        if (monthDays < 5 || monthDays > 30){
            System.out.println("failure monthDays");
            return;
        }
        double earnedMoneyPerDay = Double.parseDouble(scanner.nextLine());
        if (earnedMoneyPerDay < 10.00 || earnedMoneyPerDay > 2000.00){
            System.out.println("failure earnedMoneyPerDay");
            return;
        }

        double usdExchangeRate =  Double.parseDouble(scanner.nextLine());
        if (usdExchangeRate < 0.99 || usdExchangeRate > 1.99){
            System.out.println("failure usdEchangeDay");
            return;
        }

        double monthSallary = monthDays * earnedMoneyPerDay;
        double yearEarningsUSD = monthSallary * 12 + monthSallary * 2.5;

        double bills = yearEarningsUSD * 0.25;

        double clearYearEarningsUSD = yearEarningsUSD - bills;
        double clearYearEarningsBGN = clearYearEarningsUSD * usdExchangeRate;

        double averageEarningPerDay = clearYearEarningsBGN / 365;

        System.out.printf("Average earning per day: %.2f", averageEarningPerDay);



    }
}
