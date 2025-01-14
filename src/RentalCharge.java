import java.util.Scanner;

public class RentalCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter scooter type (50cc or 125cc): ");
        String scooterType = sc.nextLine();
        System.out.print("Do you wish to hire for the weekend or weekday): ");
        String rentalDate = sc.nextLine();
        System.out.print("Enter number of hours for the hire: ");
        int hours = sc.nextInt();

        double charge = 0;
        if (scooterType.equals("50cc")) {
            if (rentalDate.equals("weekend")) {
                if (hours <= 3) {
                    charge = 30;
                } else {
                    charge = 30 + (hours - 3) * 7.5;
                }
            } else if (rentalDate.equals("weekday")) {
                if (hours <= 3) {
                    charge = 35;
                } else {
                    charge = 35 + (hours - 3) * 8.5;
                }
            } else {
                System.out.println("Invalid rental date. Must be 'weekend' or 'weekday'.");
            }
        } else if (scooterType.equals("125cc")) {
            if (rentalDate.equals("weekend")) {
                if (hours <= 3) {
                    charge = 30;
                } else {
                    charge = 30 + (hours - 3) * 7.5;
                }
            } else if (rentalDate.equals("weekday")) {
                if (hours <= 3) {
                    charge = 35;
                } else {
                    charge = 35 + (hours - 3) * 8.5;
                }
            } else {
                System.out.println("Invalid rental date. Must be 'weekend' or 'weekday'.");
            }
        } else {
            System.out.println("Invalid scooter type. Must be '50cc' or '125cc'.");
        }

        if (charge > 0) {
            System.out.println("The fee is  €" + charge + " for a scooter ride on a " + scooterType + " on the " + rentalDate +" ");
        }
    }
}




