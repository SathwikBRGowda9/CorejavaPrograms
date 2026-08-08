import java.util.Scanner;

public class EcommerceDiscountEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cart Total: ");
        double cartTotal = sc.nextDouble();

        double discountRate;

        if (cartTotal < 1000) {
            discountRate = 0;
        } 
        else if (cartTotal < 5000) {
            discountRate = 5;
        } 
        else if (cartTotal < 10000) {
            discountRate = 10;
        } 
        else {
            discountRate = 20;
        }
        double discount = (cartTotal * discountRate) / 100;

        double finalAmount = cartTotal - discount;

        System.out.println("Cart Total      : ₹" + cartTotal);
        System.out.println("Discount Rate   : " + discountRate + "%");
        System.out.println("Discount Amount : ₹" + discount);
        System.out.println("Final Bill      : ₹" + finalAmount);

        sc.close();
    }
}