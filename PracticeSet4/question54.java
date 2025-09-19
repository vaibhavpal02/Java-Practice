//Q54. Write a program to check whether two given numbers are co-prime numbers or not
import java.util.*;
public class question54
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();
        int min=Math.min(n1,n2);
        int count=0;
        for(int i=1;i<=min;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                 count++;
                 if(count>1)
                 {
                    break;
                 }
            }
        }
        if(count==1)
        {
            System.out.print("Numbers are co prime");
        }
        else 
        {
            System.out.print("Numbers are not co prime");
        }

    }
}