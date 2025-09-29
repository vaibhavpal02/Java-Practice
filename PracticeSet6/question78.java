//Write a function to print first N prime numbers.
import java.util.*;
public class question78
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            if (isPrime(i)) {
            System.out.print(i+" ");
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
