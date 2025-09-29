//Write a function to find the next prime number of a given number.
import java.util.*;
public class question77
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int max=Integer.MAX_VALUE;
        for(int i=num+1;i<=max;i++)
        {
            if (isPrime(i)) {
            System.out.println("Number is:"+i);
            break;
        } 
        }
        
    }
    public static boolean isPrime(int n) {
        if(n==2||n==3)
        {
            return true;
        }
        if(n<=1) return false;
        if(n%2==0|| n%3==0) return false;
        
            for(int i=5;i*i<=n;i=i+6)
            {
                if((n%i==0)||(n%(i+2)==0))
                {
                    return false;
                }
            }
        return true;

    }
}
