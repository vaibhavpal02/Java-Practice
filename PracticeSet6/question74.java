//Q73. Write a function to calculate LCM of two numbers.
import java.util.*;
public class question74
{
    public static void main(String[] args) 
    {
    System.out.print("Enter two number:");
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.print("LCM is: "+findLCM(a,b));
    }
    public static int findLCM(int a, int b)
{
    int max = Math.max(a, b);
    for(int lcm = max; ; lcm++)
    {
        if(lcm % a == 0 && lcm % b == 0)
        {
            return lcm;
        }
    }
}

}