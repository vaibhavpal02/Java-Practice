//Q30. Write a program to print cubes of the first 10 natural numbers.
public class question30
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 10; i++) 
        {
            int a=(int)Math.pow(i,3);
            System.out.println(a+" ");
        }
    }
}