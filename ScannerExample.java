//Write a java program to take Employee id, name, address and salary from user and display on to screen.

package Anudip_D0453;

import java.util.*;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Details");
		System.out.println("___________________");
		
		System.out.println("Enter employee id");//statement printing
		int id=sc.nextInt();//taking input form user
		
		System.out.println("Enter employee name");
		String name=sc.next();
		
		System.out.println("Enter employee address");
		String add=sc.next();
		
		System.out.println("Enter employee salary");
		double salary=sc.nextDouble();
		
		
		System.out.println("Employee id = " +id);//printing all the inputs which we have taken
		System.out.println("Employee name = " +name);
		System.out.println("Employee address = " +add);
		System.out.println("Employee salary = " +salary);

	}

}



/*
Employee Details
___________________
Enter employee id
1
Enter employee name
Shruti
Enter employee address
Solapur
Enter employee salary
50000
Employee id = 1
Employee name = Shruti
Employee address = Solapur
Employee salary = 50000.0
*/