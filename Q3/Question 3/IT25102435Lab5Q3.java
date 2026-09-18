import java.util.Scanner;

public class IT25102435Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date");
            System.exit(0);
        }

        
        if (startDate >= endDate) {

            System.out.println("Start date should be less than end date");
            System.exit(0);
        }

        int days = endDate - startDate;

        double discountRate;

        if (days < 3) {
            discountRate = 0;
        }
        else if (days <= 4) {
            discountRate = DISCOUNT_10;
        }
        else {
            discountRate = DISCOUNT_20;
        }

        double totalCharge = days * ROOM_CHARGE;

        double discountAmount = totalCharge * discountRate;

        double amountToPay = totalCharge - discountAmount;

        System.out.println("Number of days reserved: " + days);
        System.out.println("Total amount to be paid: Rs. " + amountToPay);
    }
}