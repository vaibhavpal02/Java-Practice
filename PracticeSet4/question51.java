//Q51. Write a program to print first N terms of Fibonacci series.
import java.util.*;
public class question51
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int a=0;int b=1;
        if(n==0)
        {
            System.out.print(a);
        }
        else if(n==1)
        {

            System.out.print(a+" "+b);
        }
        else 
        {   
            int c=0;
            System.out.print(a+" "+b);
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
            
        }
    }
}