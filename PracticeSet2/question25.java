//Q25. Write a program which takes the length of the sides of a triangle as an input. Display whether the triangle is valid or not.
import java.util.*;
public class question25
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first side of triangle : ");
        double a=sc.nextDouble();
        System.out.print("Enter second side of triangle : ");
        double b=sc.nextDouble();
        System.out.print("Enter third side of triangle : ");
        double c=sc.nextDouble();
        if((a+b>c)&&(b+c>a)&&(c+a>b))
        {
            System.out.println("Triangle is Valid");
        }
        else
        {
           System.out.println("Triangle is not Valid");   
        }

    }

}