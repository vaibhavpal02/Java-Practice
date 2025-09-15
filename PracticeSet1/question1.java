/*Write a program to print a given number without its last digit.*/
import java.util.*;
public class question1
{
    public static void main(String args[])
    {
        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n/10));
    }
}