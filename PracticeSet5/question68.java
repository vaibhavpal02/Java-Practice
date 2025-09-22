//Q68. Program to convert even number into its upper nearest odd number using switch statement.
import java.util.*;
public class question68
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the even number:");
        int n=sc.nextInt();
        int key=Integer.MAX_VALUE;
        if(n%2==0)key=1;
        if(n%2!=0)key=2;
        if(n==0)key=3;
        switch(key) {
            case 1:
                System.out.println(n+1);
                break;
            case 2:
                System.out.println("Please enter the even number, wrong input");
                break;
            case 3:
               System.out.println("Please enter the even number, wrong input");
                break; 
               
            default:
                throw new AssertionError();
        }
    }
}