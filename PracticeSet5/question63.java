//Q63. Write a menu driven program with the following options:
// a. Check whether a given set of three numbers are lengths of an isosceles triangle or not
// b. Check whether a given set of three numbers are lengths of sides of a right angled triangle or not
// c. Check whether a given set of three numbers are equilateral triangle or not
// d. Exit

import java.util.*;
public class question63
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the sides of triangle: ");
      int first=sc.nextInt();
      int second=sc.nextInt();
      int third=sc.nextInt();
      if(triangleCheck(first, second, third)==true)
      {
     while(true)
     {
    System.out.println("a. Check whether a given set of three numbers are lengths of an isosceles triangle or not b. Check whether a given set of three numbers are lengths of sides of a right angled triangle or not c. Check whether a given set of three numbers are equilateral triangle or not d. Exit");
     
     System.out.print("Input the character from the prompt: ");
     char ch =sc.next().charAt(0);
     switch (ch) {
         case 'a':
             {
               if((first==second)||(second==third)||(third==first))
               {
                System.out.println("It is an isosceles triangle");
               }
               else 
               System.out.println("It is not an isosceles triangle");
             }break;
            case 'b':
               {
                 int maxside=maxSide(first, second, third);
                 int x=0,y=0;
                if(maxside==first){x=second;y=third;}
                if(maxside==second){x=third;y=first;}
                if(maxside==third){x=second;y=first;}
                 
                if(maxside*maxside==((x*x)+(y*y)))
                {
                   System.out.println("Right Angled Triangle");
                }
                else 
                 System.out.println("Not a Right Angled Triangle");
               }
             break;
             case 'c':
                {
                  if((first==second)&&(second==third)&&(third==first))
                  System.out.println("Equilateral Triangle");
                  else 
                  System.out.println("Not an Equilateral Triangle");
                }break;
            case 'd':
                System.out.println("Exit");
                System.exit(0);
         default:
             System.out.println("Wrong Input");
     }
     
     }
      }


























      else 
      {
        System.out.println("It is not a triangle");
      }
  }
  public static boolean triangleCheck(int first,int second,int third)
  {
    if((first+second>third)&&(second+third>first)&&(third+first>second))
    {
        return true;
    }
    else 
    return false;
  }
  public static int maxSide(int first,int second,int third)
  {
      int max=first;
      if(second>max)
       max=second;
      if(third>max)
       max=third;
      return max;
  }
}
