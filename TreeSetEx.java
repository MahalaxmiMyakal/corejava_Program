//Write a program using TreeSet insert integer values and print them.

package Anudip_D0453;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//Creating an object of treeset to store integer values
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//Assigning values 
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		
		//Printing result
		System.out.println("Values present in the set : "+ts);
	}
}




/*
Values present in the set : [10, 20, 30, 40, 50]
*/
