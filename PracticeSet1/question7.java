/*Write a program to check whether the given number is even or odd using a bitwise operator.*/
import java.util.*;
public class question7
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if((num&1)==1)
        {
            System.out.println("Odd number");
        }
        else
        {
            System.out.println("Even number");
        }
    }
}