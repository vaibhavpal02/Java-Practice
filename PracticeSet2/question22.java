//Q22. Write a program to take marks of 5 subjects from the user. Assume marks are given out of 100 and passing marks is 33. Now display whether the candidate passed the examination or failed.
import java.util.*;
public class question22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 subjects marks of a student: ");
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        double x3=sc.nextDouble();
        double x4=sc.nextDouble();
        double x5=sc.nextDouble();
        if((x1>=33&&x2>=33&&x3>=33&&x4>=33&&x5>=33))
        {
            System.out.println("Student is passed");
        }
        else
        {
            System.out.println("Student is fail");
        }
        // double sum=x1+x2+x3+x4+x5;
        // double computattion=(sum/500)*100;
        // if(computattion>=33)
        // System.out.println("Student is passed");
        // else
        // System.out.println("Student is fail");

    }
}