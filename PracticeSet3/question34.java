//Q34. Write a program to print Hello N times on the screen.
import java.util.*;
public class question34
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Hello");
        }

    }
}