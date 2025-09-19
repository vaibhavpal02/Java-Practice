//Q56. Write a program to print all Prime numbers between two given numbers.
import java.util.*;
public class question56
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the LowerLimit: ");
      int lowerLimit=sc.nextInt();
      System.out.print("Enter the UpperLimit: ");
      int upperLimit=sc.nextInt();
      for(int i=lowerLimit;i<upperLimit;i++)
      {
        if(primeNumber(i))
        {
            System.out.print(i+" ");
        }
      }
  }

  public static boolean primeNumber(int n)
  {
    if(n<=1)
    return false;
    else if(n==2||n==3)
    return true;
    else if((n%2==0)||(n%3==0))
    return false;
    else 
    {
        boolean isPrime=true;
        for(int i=5;i*i<=n;i=i+6)
        {
            if((n%i==0)||(n%(i+2)==0))
            {
                isPrime=false;
                break;
            }

        }
        if(isPrime)
        return true;
        else
        return false;
    }
  }
}