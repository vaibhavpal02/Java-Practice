//Q82. Write a function to calculate the number of arrangements one can make from n items and r selected at a time (nPr).
import java.util.*;
public class question82
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        double result;
        result=fact(n)/(fact(n-r));
        System.out.println("Output is: "+result);
    }
    public static long fact(int n)
    {
        long fact=1;
        if(n==0)return 1;
        else 
        {
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
        }
        return fact;
    }
}