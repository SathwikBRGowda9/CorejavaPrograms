import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Largest Number = " + largest);

        sc.close();
    }
}