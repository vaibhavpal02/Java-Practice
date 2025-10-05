//Q83. Write a function to check whether a given number contains a given digit or not.
import java.util.*;
public class question83
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Math.abs(sc.nextInt());
        System.out.print("Enter the digit: ");
        int digit = sc.nextInt();
        if(checkDigit(num,digit)==true)
        {
          System.out.println("Yes it Exist.");
        }
        else
        {
            System.out.println("Yes doesn't Exist.");
        }
    }
    public static boolean checkDigit(int num,int digit)
    {
        int n=num;
        int last_digit;
        boolean flag=false;
        if(num==0 && digit==0) return true;
        while(n>0)
        {
            last_digit=n%10;
            if(last_digit==digit)
            {
                flag=true;
                break;
            }
            n=n/10;
        }
        return flag;
    }
}