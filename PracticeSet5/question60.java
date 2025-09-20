//Q60. Write a program which takes the month number as an input and displays number of days in that month.
import java.util.*;
public class question60
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("31");
                break;
            case 2:
                System.out.print("28/29");
                break;
            case 3:
                System.out.print("31");
                break;
            case 4:
                System.out.print("30");
                break;
            case 5:
                System.out.print("31");
                break;
            case 6:
                System.out.print("30");
                break;
            case 7:
                System.out.print("31");
                break;
            case 8:
                System.out.print("31");
                break;
            case 9:
                System.out.print("30");
                break;
            case 10:
                System.out.print("31");
                break;
            case 11:
                System.out.print("30");
                break;
            case 12:
                System.out.print("31");
                break;
            default:
                 System.out.print("Wrong Input");
                 break;
        }

    }
}