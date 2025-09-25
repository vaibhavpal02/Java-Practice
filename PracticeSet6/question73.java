
import java.util.*;

//Q73. Write a function to calculate the factorial of a number.
public class question73
{
   public static void main(String[] args) 
   {
      System.out.print("Enter any number: ");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    
     System.out.println("Factorial is: "+factorial(n));

   }
   public static int factorial(int n)
   {
    int fact=1;
    for(int i=1;i<=n;i++)
    {
       fact=fact*i;
    }
    return fact;
   }
}