//47. Write a program to calculate sum of squares of first N natural numbers.
import java.util.*;
public class question47
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
          sum=sum+(i*i);
        }
        System.out.print("Sum is: "+sum);
        
    }
}