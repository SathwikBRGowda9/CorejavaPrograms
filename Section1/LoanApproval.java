import java.util.Scanner;

public class LoanApproval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Monthly Sales: ");
        double monthlySales = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Months Active: ");
        int monthsActive = sc.nextInt();

        if (monthsActive > 6) {

            if (monthlySales >= 500000) {

                if (creditScore >= 650) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Loan Denied");
                }

            } else if (monthlySales >= 100000 && monthlySales <= 499999) 
                {

                if (creditScore >= 720) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Loan Denied");
                }

            } else {
                System.out.println("Denied: Low sales volume");
            }

        } else {
            System.out.println("Denied: Insufficient history");
        }

        sc.close();
    }
}