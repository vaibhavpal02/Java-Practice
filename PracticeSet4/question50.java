//Q50. Write a program to find the Nth term of the Fibonacci series.
import java.util.*;
public class question50
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int a=0;int b=1;
        if(n==0)
        {
            System.out.println(a);
        }
        else if(n==1)
        {
            System.out.println(b);
        }
        else 
        {   
            int c=0;
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }
}