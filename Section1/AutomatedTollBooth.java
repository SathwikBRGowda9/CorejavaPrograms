import java.util.Scanner;

public class AutomatedTollBooth {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Type (Car/Truck): ");
        String vehicleType = sc.next();

        System.out.print("Is it Peak Hour? (true/false): ");
        boolean isPeakHour = sc.nextBoolean();

        if (vehicleType.equalsIgnoreCase("Car")) {

            if (isPeakHour) {
                System.out.println("Toll Fee = ₹100");
            } else {
                System.out.println("Toll Fee = ₹50");
            }

        } else if (vehicleType.equalsIgnoreCase("Truck")) {

            if (isPeakHour) {
                System.out.println("Toll Fee = ₹250");
            } else {
                System.out.println("Toll Fee = ₹150");
            }

        } else {
            System.out.println("Invalid Vehicle");
        }

        sc.close();
    }
}