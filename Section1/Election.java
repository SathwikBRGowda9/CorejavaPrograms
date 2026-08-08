import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        String result = (age >= 25) ? "Eligible" : "Not Eligible";

        System.out.println(result);

        sc.close();
    }
}