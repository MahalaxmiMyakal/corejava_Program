//Write a program using vector to store the list of students details and print the details.

package Anudip_D0453;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		//Creating an object to store student details
		Vector<Integer> id=new Vector<Integer>();
		Vector<String> Name=new Vector<String>();
		Vector<String> Gender=new Vector<String>();
		Vector<String> Address=new Vector<String>();

		//Assigning values
		id.add(101);
		Name.add("Shruti");
		Gender.add("Female");
		Address.add("1910, New Paccha Peth, Solapur. ");

		//Printing result
		System.out.println("----------Student Details-----------");
		System.out.println("Student id : "+id);
		System.out.println("Student Name : "+Name);
		System.out.println("Student Gender : "+Gender);
		System.out.println("Student Address : "+Address);
	}
}




/*
----------Student Details-----------
Student id : [101]
Student Name : [Shruti]
Student Gender : [Female]
Student Address : [1910, New Paccha Peth, Solapur. ]
*/
