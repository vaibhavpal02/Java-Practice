//Q49. Write a program to check whether a given number is a Prime number or not.
import java.util.*;
public class question49
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number: ");
       int n=sc.nextInt();
       if(n<=1)
       {
         System.out.println("Neither Prime nor a Composite");
       }
       else if((n==2)||(n==3))
       {
          System.out.println("Prime Number");
       }
       else if((n%2==0)||(n%3==0))
       {
          System.out.println("Not a Prime Number");
       }
       else 
       {
        boolean isPrime=true;
        for(int i=5;i*i<=n;i=i+6)
       {
        if((n%i==0)||((n%(i+2)==0)))
        {
          isPrime=false;
          break;
        }
       }
       if(isPrime)
       System.out.println("Prime Number");
       else 
       System.out.println("Not a Prime Number");
       }

    }
}