import java.util.Scanner;

public class SmallestFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Five Numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int smallest = (a < b) ? a : b;
        smallest = (smallest < c) ? smallest : c;
        smallest = (smallest < d) ? smallest : d;
        smallest = (smallest < e) ? smallest : e;

        System.out.println("Smallest Number = " + smallest);
        sc.close();
    }
}