import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Speed: ");
        int speed = sc.nextInt();

        int fine = (speed <= 60) ? 0 :
                   (speed <= 80) ? 100 :
                   (speed <= 120) ? 1000 : 5000;

        System.out.println("Fine = ₹" + fine);
        sc.close();
    }
} 