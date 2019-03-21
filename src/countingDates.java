import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class countingDates {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        //String birthday = scanner.nextLine();
        String birthdayStr = "01-01-1990";
        String dataFormat = "dd-MM-yyyy";

        SimpleDateFormat format = new SimpleDateFormat(dataFormat, Locale.ENGLISH);
        Date date = format.parse(birthdayStr);

        Calendar c = Calendar.getInstance();
        c.setTime(date); // Now use today date.
        c.add(Calendar.DATE, 10); // Adding 5 days
        String output = format.format(c.getTime());
        System.out.println(output);

    }
}
