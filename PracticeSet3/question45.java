//Q45. Write a program to calculate sum of first N even natural numbers.
import java.util.*;
public class question45
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
          sum=sum+2*i;
        }
        System.out.print("Sum is: "+sum);
        
    }
}