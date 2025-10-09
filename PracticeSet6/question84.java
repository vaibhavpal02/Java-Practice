//Q84. Write a function to print all prime factors of a given number. For example, if the number is 36 then your result should be 2, 2, 3, 3.
import java.util.*;
public class question84
{
    public static void main(String[] args) 
    {
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter the Number: ");
      int num = sc.nextInt();
      for(int i=2;i<=num;i++)
      {
          if(isPrime(i)==true)
          {
            while(num%i==0)
            {
             System.out.print(i+" ");
             num=num/i;
            }
          
          }
      }


    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6)
        {
            if((n%i==0)||(n%(i+2)==0))
            {
                  return false;
            }
        }
        return true;
    }
}