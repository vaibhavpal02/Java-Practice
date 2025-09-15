/*Write a program to make the last digit of a number stored in a variable as zero.
(Example – if x = 2345 then make it x = 2340)
*/
public class question8
{
    public static void main(String args[])
    {
        // Scanner sc= new Scanner(System.in);
        System.out.println("Input is 2345");
        int number=2345;
        int operation=number/10;
        int result=operation*10;
        System.out.println("result:"+result);
    }
}