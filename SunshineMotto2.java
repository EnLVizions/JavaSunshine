import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class SunshineMotto2 {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {
        int rentalTime = RentalTimeInput();
        Motto();
        computeTime(rentalTime);
        Date d = new Date();
        String strDate;
        strDate = getDateFromUser();
        System.out.println("Date as entered: " + strDate);
    }
    private static String getDateFromUser() {
        String enteredDate;
        System.out.print("Enter a date (MM/DD/YYYY format): ");
        enteredDate = scanner.nextLine();
        return enteredDate;
    }

    private static void formatDate(String enteredDate){
       String enteredPattern = "MM/dd/yyyy";
       String newPattern = "MMMM dd, yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(enteredPattern);
        try {
            Date d = sdf.parse(enteredDate);
            sdf.applyPattern(newPattern);
            String newDateString = sdf.format(d);
            System.out.println("Entered date formatted: " + newDateString);
        }
        catch (ParseException pe) {
            System.out.println("Invalid Date Entered, please use the MM/DD/YYYY format");
        }

    }


    public static int RentalTimeInput() {
        int time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the rental time (in minutes): ");
        time = scanner.nextInt();
        return time;
    }


    public static void Motto() {
        System.out.println("****************************");
        System.out.println("*Sunshine Seashores Rentals*");
        System.out.println("****************************");
    }

    public static void computeTime(int rentalTime) {
        int hoursRented = rentalTime / 60;
        int minutesRented = rentalTime - hoursRented * 60;
        final int HOURLY_RATE = 40;
        double price;

        if (minutesRented >= 40) {
            price = hoursRented * HOURLY_RATE + 40;
            System.out.println("Hours: " + hoursRented);
            System.out.println("Minutes: " + minutesRented);
            System.out.println("Total Price: $" + price);
        } else if (minutesRented < 40) {
            price = hoursRented * HOURLY_RATE + 40;
            System.out.println("Hours: " + hoursRented);
            System.out.println("Minutes: " + minutesRented);
            System.out.println("Total Price: $" + price);

        }
    }
}



