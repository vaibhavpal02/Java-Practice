//Inverted Mirror Right Angled Triangle.
import java.util.*;
public class question89
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}