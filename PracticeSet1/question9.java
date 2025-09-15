/*Write a program to input a three-digit number from the user and rotate its digits by one position towards the right.*/
import java.util.*;
public class question9
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a three Digit Number: ");
        int num=sc.nextInt();
        int lastDigit=num%10;
        int firsttwodigit=num/10;
        int result=lastDigit*100+firsttwodigit;
        System.out.println("Output: "+result);
    }
}