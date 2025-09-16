// Q19. Write a program to check whether a given year is a leap year or not.
import java.util.*;

public class question19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year");
        int year=sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            System.out.println("It's a leap year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
