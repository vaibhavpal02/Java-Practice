//Q38. Write a program to print the first N odd natural numbers in reverse order.
import java.util.*;
public class question38
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.print((2*i-1)+" ");

        }

    }
}