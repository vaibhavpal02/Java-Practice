//Q32. Write a program to check whether a given number is positive, negative or zero.
import java.util.*;
public class question32
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number=sc.nextInt();
        if(number>0)
        System.out.println("Positive");
        else if(number<0)
        System.out.println("Negative");
        else 
        System.out.println("Zero");

    }
}