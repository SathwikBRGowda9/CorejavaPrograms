import java.util.*;

public class Circleinput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        double diameter = 2 * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
        System.out.println("Diameter = " + diameter);

        sc.close();
    }
}