import java.util.Scanner;

public class BillDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        double discount, finalBill;

        if (bill > 10000) {
            discount = bill * 0.20;   // 20% discount
        } else {
            discount = bill * 0.05;   // 5% discount
        }

        finalBill = bill - discount;

        System.out.println("Discount = " + discount);
        System.out.println("Final Bill = " + finalBill);

        sc.close();
    }
}