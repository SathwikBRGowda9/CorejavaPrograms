import java.util.Scanner;

public class LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();

        int largest = (a > b) ? a : b;

        System.out.println("Largest Number = " + largest);

        sc.close();
    }
}