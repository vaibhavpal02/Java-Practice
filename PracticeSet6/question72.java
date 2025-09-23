//Q72. Write a function to check whether a given number is even or odd. Return 1 if the number is even, otherwise return 0.
import java.util.*;
public class question72
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("No is:"+checkNumber(n));
    }
    public static int checkNumber(int n)
    {
        if(n%2==0)
        {
         return 1;
        }
        else
        {
            return 0;
        }
    }
}