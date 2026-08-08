
import java.util.Scanner;

public class StudentDetailsepass {
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of the student: ");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        int sub6=sc.nextInt();
        int total=sub1+sub2+sub3+sub4+sub5+sub6;
        double percent=total/6;
        
        System.out.println("The total marks of the student is: "+total);
        System.out.println("The percentage of the student is: "+percent+"%");

        if(sub1<35 || sub2<35 || sub3<35 || sub4<35 || sub5<35 || sub6<35)
        {
            System.out.println("Fail");
        }

        if(percent>95)
        {
            System.out.println("First Rank");
        }
        else if(percent>=90 && percent<=95)
        {
            System.out.println("Second Rank");
        }
        else if(percent>=80 && percent<90)
        {
            System.out.println("Distantion");
        }
        else if(percent>=70 && percent<80)
        {
            System.out.println("Fourth Rank And Distantion");
        }
        else if(percent>=60 && percent<70)
        {
            System.out.println("First Class");
        }
        else if(percent>=50 && percent<60)
        {
            System.out.println("Second Class");
        }
        else if(percent>=40 && percent<50)
        {
            System.out.println("Third Class");
        }
        else if(percent>=35 && percent<40)
        {
            System.out.println("Just Pass");
        }
        else
        {
            System.out.println("Fail");
        }

       
        sc.close();
        
    
    
    }

}

 