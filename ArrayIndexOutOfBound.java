//Write a program using exception handling to handle array index out of bounds.

package Anudip_D0453;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		try //Used to write code or initialization
		{
			int arr[]=new int[10];
			arr[20]=111;
		}
		catch(ArrayIndexOutOfBoundsException e)//Used to check or handle exceptions
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally//Used to execute statement
		{
			System.out.println("Finally block");
		}
	}
}



/*
ArrayIndexOutOfBoundsException
Finally block
*/