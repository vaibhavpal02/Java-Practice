//Q62. Write a program which takes the day number of a week and displays a unique greeting message for the day
import java.util.*;
public class question62
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Monday: Be ready for Work");break;
            case 2:
                System.out.println("Tuesday: Energy is pumping like work");break;
            case 3:
                System.out.println("Wednesday: Dont be tired they is a lot of work");break;
            case 4:
                System.out.println("Thursday: Finally Did Productive in the work");break;
            case 5:
                System.out.println("Friday: Today is friday, finally");break;
            case 6:
                System.out.println("Saturday: Enjoy the weekend");break;
            case 7:
                System.out.println("Realax and prep youself for the nenxt day!");break;
            default:
                System.out.println("Wrong Input");
        }
    }
}