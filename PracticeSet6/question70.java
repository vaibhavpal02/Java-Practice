//Q70. Write a function to calculate the area of a circle. 
import java.util.*;
public class question70
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double radius=sc.nextDouble();
        double area=area(radius);
        System.out.println("Area of circle: "+area);
    }
    public static double area(double r)
    {
        double a=Math.PI*r*r;
        return a;
    }
}