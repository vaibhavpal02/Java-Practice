//Q39. Write a program to print the square of first N even natural numbers.
import java.util.*;
public class question40
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int result;
        for(int i=1;i<=n;i++)
        {
            result=(int)Math.pow((2*i),2);
            System.out.print(result+" ");

        }

    }
}