//Q65. Program to check whether a year is a leap year or not using switch statement.
import java.util.*;

public class question65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year to check if it is a leap year: ");
        int year = sc.nextInt();

        int key;
        if ((year % 400) == 0) {
            key = 1;
        } else if ((year % 100) == 0) {
            key = 2;
        } else if ((year % 4) == 0) {
            key = 1;
        } else {
            key = 2;
        }

        switch (key) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;
            case 2:
                System.out.println(year + " is not a leap year.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}

