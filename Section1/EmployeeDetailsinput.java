import java.util.*;

class EmployeeDetailsinput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Employee Details ----");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        byte age = sc.nextByte();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter Salary: ");
        short sal = sc.nextShort();

        sc.nextLine(); // Clear buffer

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Email ID: ");
        String emailid = sc.nextLine();

        System.out.print("Enter Experience: ");
        String experience = sc.nextLine();

        System.out.println("\n---- Employee Details ----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Salary     : " + sal);
        System.out.println("Department : " + department);
        System.out.println("Email ID   : " + emailid);
        System.out.println("Experience : " + experience);


        sc.close();
    }
}