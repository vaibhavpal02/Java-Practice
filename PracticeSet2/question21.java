//Q21. Write a program which takes the cost price and selling price of a product from the user. Now calculate and print profit or loss percentage.
import java.util.*;
public class question21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cost Price: ");
        double cp=sc.nextDouble();
        System.out.println("Enter the Selling Price: ");
        double sp=sc.nextDouble();
        if(sp>cp)
        {
            double profit=sp-cp;
            double pp=(profit/cp)*100;
            System.out.println("Profit Percentage is: "+pp);
        }
        else if(sp<cp)
        {
            double loss=cp-sp;
            double lp=(loss/cp)*100;
            System.out.println("Loss percentage is: "+lp);
        }
        else 
        {
            System.out.println("No profit no loss");
        }


    }
}