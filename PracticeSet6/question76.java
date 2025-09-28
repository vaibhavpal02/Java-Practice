//Q80. Write a function to check whether a given number is Prime or not.
import java.util.*;
public class question76
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
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
