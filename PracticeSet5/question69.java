
import java.util.*;

//Q69. Program to find all roots of a quadratic equation using switch case.
public class question69
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values of a,b,c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==0)
        {
          System.out.print("Not a quadratic equation;");
          System.exit(0);
        }
        double D=(b*b)-(4*a*c);
        int key=0;
        if(D>0)key=1;
        if(D==0)key=2;
        if(D<0)key=3;
        switch (key) 
        {
            case 1:
                {
                System.out.println("There are two distinct real roots");
                double r1=root1(a,b,c,D);
                double r2=root2(a,b,c,D);
                System.out.println("Root 1 is:"+r1+" Root 2 is: "+r2);
                }
                
                break;
            case 2:
                {
                System.out.println("There is exactly one real root (both roots are equal).");
               double r1=root1(a,b,c,D);
                double r2=root2(a,b,c,D);
                System.out.println("Root 1 is:"+r1+" Root 2 is: "+r2);
                }
                break;
            case 3:
    {
        System.out.println("The roots are complex (imaginary).");
        double realPart = -b / (2.0 * a);
        double imagPart = Math.sqrt(-D) / (2.0 * a);
        System.out.println("Root 1 is: " + realPart + " + " + imagPart + "i");
        System.out.println("Root 2 is: " + realPart + " - " + imagPart + "i");
    }
    break;
            default:
                throw new AssertionError();
        }
        

        
    }

    public static double root1(int a,int b,int c,double D)
        {
           double d=Math.sqrt(D);
           double N=-b+d;
           double r1=N/(2*a);
           return r1;
        }
        public static double root2(int a,int b,int c,double D)
        {
           double d=Math.sqrt(D);
           double N=-b-d;
           double r2=N/(2*a);
           return r2;
        }
}