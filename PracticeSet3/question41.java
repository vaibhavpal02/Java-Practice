// Write a program to print cubes of the first N natural numbers.
import java.util.*;
public class question41
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the any Number: ");
        int num=sc.nextInt();
        int result;
        for(int i=1;i<=num;i++)
        {
            result=(int)Math.pow(i, 3);
            System.out.println(result+" ");
        }

    }
}