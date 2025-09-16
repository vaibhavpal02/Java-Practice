// Write a program to check whether a given number is a three-digit number or not.
import java.util.*;
public class question17
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=sc.nextInt();
    int count=0;
    int temp = Math.abs(num); 
    while (temp>0) 
    { 
        temp=temp/10;
        count++;
    }
    if(count==3)
    System.out.println("Number is a three digit");
    else
    System.out.println("Number is not a three digit");

   }
}