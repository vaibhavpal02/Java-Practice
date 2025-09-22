//Q66. Program to take the value from the user as input electricity unit charges and calculate total electricity bill according to the given condition using switch statement.

// For the first 50 units Rs. 0.50/unit

// For the next 100 units Rs. 0.75/unit

// For the next 100 units Rs. 1.20/unit

// For units above 250 Rs. 1.50/unit

// An additional surcharge of 20% is added to the bill.

import java.util.*;
public class question66
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your electricity units: ");
      double units=sc.nextInt();
      int key=0;
      if(units<=50)key=1;
      if(units>50 && units<=150)key=2;
      if(units>150 && units<=250)key=3;
      if(units>250)key=4;
      switch (key) 
      {
          case 1:
            {
              double bill=units*0.50;
              double TotalBill=bill+bill*0.20;
              System.out.println("Your electricity bill is: Rs "+TotalBill);
            }
              
              break;
          case 2:
            {    
                double bill=50*0.50;
                double leftunits=units-50;
                bill=bill+(leftunits)*0.75;
                double TotalBill=bill+bill*0.20;
                System.out.println("Your electricity bill is: Rs "+TotalBill);

            }
            break;
        case 3:
          {
              double bill=50*0.50;
              double bill2=100*0.75;
              double leftunits=units-150;
              bill=bill+bill2+(leftunits)*1.20;
              double TotalBill=bill+bill*0.20;
              System.out.println("Your electricity bill is: Rs "+TotalBill);
          }
              
              break;
          case 4:
            {
              double bill=50*0.50;
              double bill2=100*0.75;
              double bill3=100*1.20;
              double leftunits=units-250;
              bill=bill+bill2+bill3+(leftunits)*1.50;
              double TotalBill=bill+bill*0.20;
              System.out.println("Your electricity bill is: Rs "+TotalBill);
            }
              
               break;
          default:
            System.out.println("Please Enter Valid Units");
              
      }
  }
}