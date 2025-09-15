/*Write a program to find the area of the circle. Take radius of circle from user as input and print the result in below given format.
Expected output format – “Area of circle is A having the radius R”. Replace A with area & R with radius.
*/
import java.util.*;
public class question5
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radius=sc.nextFloat();
        float area=3.14f*radius;
        System.out.println("Area of circle is "+area+" having the radius "+radius);
    }
}