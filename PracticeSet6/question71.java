//Q71. Write a function to calculate simple interest.
import java.util.*;
public class question71
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of P: ");
        double p=sc.nextDouble();
        System.out.print("Enter the value of R: ");
        double r=sc.nextDouble();
        System.out.print("Enter the value of T: ");
        int t=sc.nextInt();
        double si=simpleInterest(p,r,t);
        System.out.println("SI is: Rs. "+si);

    }
    public static double simpleInterest(double p,double r,int t)
    {
       double si=(p*r*t)/100;
       return si;

    }
}