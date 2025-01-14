//Write a program to find the perimeter of the square

package Anudip_D0453;

import java.util.*;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Perimeter of Square....");
		System.out.println("________________________");
		
		System.out.println("Enter the value of side");//printing the statement
		int side=sc.nextInt();//taking input from user
		
		int perimeter=side*4;//formula of perimeter of the square
		System.out.println("Perimeter of the square = "+perimeter);//printing the result

	}

}


/*
Perimeter of Square....
________________________
Enter the value of side
5
Perimeter of the square = 20
*/
