//Q16. Write a program to check whether a given number is an even number or an odd number with using % operator.

import java.util.*;
public class question16
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=sc.nextInt();
    if(num%2==0)
     System.out.println("Even");
    else
     System.out.println("Odd");
   }
}