/*Write a program to input a three-digit number and display the sum of the digits.
 */
import java.util.*;
public class question4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first=sc.nextInt();
        System.out.print("Enter second number: ");
        int second=sc.nextInt();
        System.out.print("Enter third number: ");
        int third=sc.nextInt();
        int sum=first+second+third;
        System.out.println("Sum is: "+sum);
    }
}