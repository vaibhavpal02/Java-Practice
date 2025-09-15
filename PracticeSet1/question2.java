/*Write a program to swap values of two int variables.*/
import java.util.*;
class question2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first=sc.nextInt();
        System.out.print("Enter second number: ");
        int second=sc.nextInt();
        int temp;
        temp=first^second;
        first=first^temp;
        second=second^temp;
        System.out.println("First Number: "+first);
        System.out.print("Second Number: "+second);

    }
}