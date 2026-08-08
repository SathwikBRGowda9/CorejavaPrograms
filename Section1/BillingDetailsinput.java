import java.util.*;;
class BillingDetailsinput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the price, discount, and gst");
        double price = sc.nextDouble();
        double dis = sc.nextDouble();
        
        double gst = sc.nextDouble();

        double disAmt = price * dis / 100;
        double total = price - disAmt;

        double gstAmt = total * gst / 100;
        double bill = total + gstAmt;
		
		System.out.println("Billing Detailse");

        System.out.println(price);
        System.out.println(dis);
        System.out.println(total);
        System.out.println(gst);
        System.out.println(bill);

        sc.close();
    }
}