//Q31. Write a program to check whether a given number is divisible by 3 and divisible by 2.
import java.util.*;
public class question31
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter the number: ");
    int num=sc.nextInt();
    if((num%2==0)&&(num%3==0))
    {
        System.out.println("Number is divisible by 2 and 3");
    }
    else
    {
        System.out.println("Number is not divisible by 2 and 3");
    }

  }
}
