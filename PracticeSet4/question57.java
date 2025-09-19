//Q57. Write a program to find next Prime number of a given number.
import java.util.*;
public class question57
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number: ");
      int lowerLimit=sc.nextInt();
      int upperLimit=Integer.MAX_VALUE;
      for(int i=lowerLimit+1;i<upperLimit;i++)
      {
        if(primeNumber(i))
        {
            System.out.print(i+" ");
            break;
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
        {
          return true;
        }
        
        else
        {
           return false;
        }
        
    }
  }
}