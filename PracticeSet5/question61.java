//Q61. Write a menu driven program with the following options:
// a. Addition
// b. Subtraction
// c. Multiplication
// d. Division
// e. Exit
import java.util.*;
public class question61
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        while (true) 
        { 
              System.out.println("a. Addition b. Subtraction c. Multiplication d. Division e. Exit");
        System.out.print("Enter the the given Character to perform the following Operations:");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a':
        {System.out.println("Enter the Value of first number");
        int first=sc.nextInt();
        System.out.println("Enter the Value of second number");
        int second=sc.nextInt();
                System.out.println("Addition: "+(first+second));
                break;}
            case 'b':
        {System.out.println("Enter the Value of first number");
        int first=sc.nextInt();
        System.out.println("Enter the Value of second number");
        int second=sc.nextInt();
                System.out.println("Substraction: "+(first-second));
                break;}
            case 'c':
        {System.out.println("Enter the Value of first number");
        int first=sc.nextInt();
        System.out.println("Enter the Value of second number");
        int second=sc.nextInt();
                System.out.println("Multiplication: "+(first*second));
                break;}
            case 'd':
               { System.out.println("Enter the Value of first number");
        int first=sc.nextInt();
        System.out.println("Enter the Value of second number");
        int second=sc.nextInt();
                System.out.println("Division: "+(first/second));
                break;}
            case 'e':
                {System.out.println("Exit");
                System.exit(0);}
            default:
                {System.out.println("Wrong input Sorry!");}
        }
        }
       
    }
}
