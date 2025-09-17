// Write a program to print a table of N
import java.util.*;
public class question43
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the any Number: ");
        int num=sc.nextInt();
        for (int i = 1; i<=10; i++) 
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}