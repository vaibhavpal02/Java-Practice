/*Write a program to swap values of two int variables without using a third variable.*/
import java.util.*;
class question3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first=sc.nextInt();
        System.out.print("Enter second number: ");
        int second=sc.nextInt();
        first=first+second;
        second=first-second;
        first=first-second;
        System.out.println("First Number: "+first);
        System.out.print("Second Number: "+second);
    }
}