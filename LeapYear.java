//Write a program to check leap year using if else. How to check whether a given year is a leap year or not

package Anudip_D0453;

import java.util.*;

public class LeapYear {
   public static void main(String[] args){
      int year;//declaring variable
      System.out.println("Enter year : ");//printing statement
      Scanner sc = new Scanner(System.in);//taking input from user
      year =sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))//condition for leap year
      {
         System.out.println("This is a leap year");
      }
      else
      {
         System.out.println("This is not a leap year");
      }
   }
}



/*
Enter year : 
2016
This is a leap year
*/