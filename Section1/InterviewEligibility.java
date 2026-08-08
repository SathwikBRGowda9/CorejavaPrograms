import java.util.Scanner;

public class InterviewEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter aggregate percentage: ");
        double aggregate = sc.nextDouble();

        if (aggregate >= 60) {
            System.out.println("Candidate is eligible for interview.");
        } else {
            System.out.println("Candidate is not eligible for interview.");
        }

        sc.close();
    }
}