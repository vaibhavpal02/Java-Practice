//Q67. Program to convert a positive number into a negative number and negative number into a positive number using switch statement.
import java.util.*;
public class question67
{
 public static void main(String[] args) 
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
     int n=sc.nextInt();
     int key=0;
     if(n>0)key =1;
     if(n<0)key =2;
     if(n==0)key=3;
     switch (key) {
         case 1:
             System.out.print(-n);
             break;
         case 2:
             System.out.print(Math.abs(n));
             break;
         case 3:
            System.out.println("Neither positive nor neagtive");
            break;
         default:
             throw new AssertionError();
     }
 }
}