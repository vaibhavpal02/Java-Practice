//Q44. Write a program to calculate sum of first N natural numbers.
import java.util.*;
public class question44
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
          sum=sum+i;
        }
        System.out.print("Sum is: "+sum);
        
    }
}