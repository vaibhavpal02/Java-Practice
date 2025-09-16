//Write a program to check whether a given character is an alphabet (uppercase), an alphabet (lower case), a digit or a special character

import java.util.*;
public class question24
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any character : ");
        int ch=sc.next().charAt(0);
        int num=(ch);
        if(num>=97 && num <=122)
        {
            System.out.println("LowerCase");
        }
        else if(num>=65 && num <=90)
        {
            System.out.println("UpperCase");
        }
        else if(num>=48 && num <=57)
        {
            System.out.println("Digit");
        }
        else 
        {
            System.out.println("Special Character");
        }

   }
}