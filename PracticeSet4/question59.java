//Q59. Write a program to print all Armstrong numbers under 1000.
public class question59
{
    public static void main(String[] args) 
    {
        for(int i=0;i<1000;i++)
        {
        if(isArmstrong(i)==true)
        {
            System.out.print(i+" ");
        }

        }
        
    }
    public static boolean isArmstrong(int n)
    {
       int pow=(int)Math.log10(n)+1;
       int sum=0;int digit;
       int num=n;
       while(n>0)
       {
       digit=n%10;
       sum=sum+(int)Math.pow(digit,pow);
       n=n/10;
       }
       if(num==sum)
       {
        return true;
       }
       else 
        return false;
    }
}