import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        double tax = (bill > 100000) ? 22 :
                     (bill >= 50000) ? 12 :
                     (bill >= 20000) ? 8 : 0;

        double finalBill = bill + (bill * tax / 100);

        System.out.println("Tax = " + tax + "%");
        System.out.println("Final Bill = " + finalBill);

            sc.close();

    }
    
} 