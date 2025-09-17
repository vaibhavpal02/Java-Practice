//Write a program to print the first N natural numbers.
import java.util.*;
public class question35
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }

    }
}