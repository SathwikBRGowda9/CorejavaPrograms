import java.util.Scanner;

public class VehicleLicence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Speed: ");
        int speed = sc.nextInt();

        if (speed > 120) {
            System.out.println("Fine: ₹5000");
            System.out.println("Vehicle Seized and Driving Licence Suspended");
        }
        else if (speed > 100) {
            System.out.println("Fine: ₹3000");
        }
        else if (speed > 80) {
            System.out.println("Fine: ₹2000");
        }
        else if (speed > 60) {
            System.out.println("Fine: ₹1000");
        }
        else if (speed > 30) {
            System.out.println("Fine: ₹500");
        }
        else {

            System.out.println("No Fine. Drive Safely!");
        }

        sc.close();
    }
}