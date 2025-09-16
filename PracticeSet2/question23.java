//Q23. Write a program to check whether a given alphabet is in uppercase or lowercase.
import java.util.*;
public class question23
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");
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
        else 
        {
            System.out.println("Wrong Input");
        }

   }
}