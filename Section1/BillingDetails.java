class BillingDetails
{
    public static void main(String[] args)
    {
        double price = 1000;
        double dis = 20;
        double gst = 12;

        double disAmt = price * dis / 100;
        double total = price - disAmt;

        double gstAmt = total * gst / 100;
        double bill = total + gstAmt;

        System.out.println(price);
        System.out.println(dis);
        System.out.println(total);
        System.out.println(gst);
        System.out.println(bill);
    }
}