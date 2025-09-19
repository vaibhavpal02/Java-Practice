//Q52. Write a program to check whether a given number is there in the Fibonacci series or not.
import java.util.*;
public class question52
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int a=0;int b=1;
        if(n==0)
        {
            System.out.print("Yes number Present in Series");
        }
        else if(n==1)
        {

            System.out.print("Yes number Present in Series");
        }
        else 
        {   
            int c=0;
            boolean isPresent=false;
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                if(c==n)
                {isPresent=true;}
                if(c>n)
                {break;}
                a=b;
                b=c;
            }
            if(isPresent)
            {
               System.out.print("Yes, number is Present in Series");
            }
            else 
            {
                System.out.print("No number is not Present in Series");
            }
            
        }
    }
}