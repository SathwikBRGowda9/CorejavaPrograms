import java.util.Scanner;

public class Tringelprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side1 side2 And side3 of the triangle: ");
        double side1 = sc.nextDouble(); 
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble(); 
        if(side1==side2 && side2==side3)
        {
            System.out.println("The triangle is Equilateral.");
        }
        else if(side1==side2 || side2==side3 || side1==side3)
        {
            System.out.println("The triangle is Isosceles.");
        }
        else
        {
            System.out.println("The triangle is Scalene.");         
        }
        sc.close();
        
    }
}
