//Q20. Write a program to find the greatest among three given numbers. Print number once if the greatest number appears two or three times.
import java.util.*;
public class question20
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int max=a;
      if(b>max)
      {
        max=b;
      }
      if(c>max)
      {
        max=c;
      }
      System.out.println("Maximum Number is: "+max);
    }
}