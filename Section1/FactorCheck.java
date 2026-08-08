import java.util.Scanner;

public class FactorCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of m: ");
        int m = sc.nextInt();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (m % n == 0) {
            System.out.println(n + " is a factor of " + m);
        } else {
            System.out.println(n + " is not a factor of " + m);
        }

        sc.close();
    }
}