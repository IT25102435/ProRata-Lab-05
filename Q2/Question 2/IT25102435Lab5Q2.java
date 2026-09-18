import java.util.Scanner;

public class IT25102435Lab5Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of new members: ");
        int members = input.nextInt();

        if (members < 0) {
            System.out.println("Invalid number of members");
            System.exit(0);
        }

        switch (members) {

            case 0:
                System.out.println("No Prize");
                break;

            case 1:
                System.out.println("Pen");
                break;

            case 2:
                System.out.println("Umbrella");
                break;

            case 3:
                System.out.println("Bag");
                break;

            case 4:
                System.out.println("Travelling Chair");
                break;

            default:
                System.out.println("Headphone");
        }
    }
}