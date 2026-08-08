import java.util.*;

class Addition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        int c = a + b;
        int d = a - b;

        System.out.println("Sum of numbers = " + c);
        System.out.println("Subtraction of numbers = " + d);
        sc.close();
    }
}