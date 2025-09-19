//Q58. Write a program to check whether a given number is an Armstrong number or not.
import java.util.*;
public class question58
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        if(isArmstrong(n)==true)
        {
            System.out.print("Armstrong Number");
        }
        else 
        {
            System.out.print("Not a Armstrong Number");
        }

    }
    public static boolean isArmstrong(int n)
    {
       int pow=(int)Math.log10(n)+1;
       int sum=0;int digit;
       int num=n;
       while(n>0)
       {
       digit=n%10;
       sum=sum+(int)Math.pow(digit,pow);
       n=n/10;
       }
       if(num==sum)
       {
        return true;
       }
       else 
        return false;
    }
}