/*Write a program which takes a character as an input and displays its ASCII code.*/
import java.util.*;
public class question6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);
        int display=(input);
        System.out.println("ASCII code: "+display);
    }
}