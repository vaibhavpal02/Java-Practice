//Q80.Write a function to print first N terms of Fibonacci series.
import java.util.*;
public class question80 {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }

    public static void fibo(int n) {
        int a = 0, b = 1;
        if (n >= 1)
            System.out.print(a + " ");
        if (n >= 2)
            System.out.print(b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
