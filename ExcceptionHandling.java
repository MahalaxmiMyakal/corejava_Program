//Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

package Anudip_D0453;

public class ExcceptionHandling {

	public static void main(String[] args) {
		try 
		{
			int ans=20/0;//Initialized or written code 
		}
		catch(ArithmeticException e)//Handling the exceptions
		{
			System.out.println(e);//Printing
		}		
	}
}



/*
java.lang.ArithmeticException: / by zero
 */