//Q48. Write a program to calculate factorial of a number.
import java.util.*;
public class question48

{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int factorial=1;
        if(n==0)
        {
          System.out.println(factorial);
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                factorial=factorial*i;
            }
            System.out.println(factorial);
        }
    }
}