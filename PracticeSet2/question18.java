//Q18. Write a program to check whether roots of a given quadratic equation are real & distinct, real & equal or imaginary roots
import java.util.*;

public class question18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        float d=(b*b)-4*a*c;
        if(d>0)
        {
            System.out.println("Real and distinct Roots");
        }
        else if(d==0)
        {
            System.out.println("Real and Equal Roots");
        }
        else 
        {
            System.out.println("Imaginary Roots");
        }

    }
}