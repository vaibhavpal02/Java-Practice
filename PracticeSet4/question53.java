//Q53. Write a program to calculate HCF of two numbers.
import java.util.*;
public class question53
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();
        int min=Math.min(n1,n2);
        int result=0;
        for(int i=1;i<=min;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                 result=i;
            }
        }
        System.out.print("HCF is: "+result);

    }
}