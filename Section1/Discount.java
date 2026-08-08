import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        double discount = (bill > 1000) ? 10 : 5;

        double finalBill = bill - (bill * discount / 100);

        System.out.println("Discount = " + discount + "%");
        System.out.println("Final Bill = " + finalBill);

        sc.close();
    }
}
// A store gives a 10% discount if 
// the billing amount is greater than $1000;
//  otherwise, it gives a 5% discount. Calculate the
//   final bill using a
//  single line of code with the conditional (ternary) operator.