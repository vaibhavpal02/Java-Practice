//Q79. Write a function to calculate HCF of two numbers.
import java.util.*;
public class question75
{
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("HCF is: "+HCF(num1,num2));
    }
    public static int HCF(int a,int b)
    {
        int min=Math.min(a,b);
        int hcf;
        hcf=1;
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                 hcf=i;
            }
        }
        return min;
    }
}