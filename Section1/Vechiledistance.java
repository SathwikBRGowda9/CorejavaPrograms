import java.util.*;;


public class Vechiledistance {
     public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The time");
        double time = sc.nextDouble();
        System.out.println("Enter The Distance");

        double distance = sc.nextDouble();
        double speed = distance / time;
    
        System.out.println(speed);
        sc.close();
        
     }
}
