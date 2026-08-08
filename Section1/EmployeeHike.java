import java.util.Scanner;

public class EmployeeHike {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of projects completed: ");
        int projects = sc.nextInt();

        if (projects > 5) {
            System.out.println("Employee is eligible for a hike.");
        } else {
            System.out.println("Employee is not eligible for a hike.");
        }

        sc.close();
    }
}