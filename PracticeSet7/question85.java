//Q85. Write a program to draw a square pattern of *
import java.util.*;
public class question85
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: " );
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n;j++)
          {
            System.out.print("* ");
          }
          System.out.print("\n");
        }

    }
}