//Write a program demonstrating multiple catch statements and finally block.

package Anudip_D0453;

public class MultipleCatch {

	public static void main(String[] args) {

		try //Used to write a code or initializing
		{
			int arr[]=new int[10];
			arr[20]=111;
		}

		catch(ArithmeticException e)//Used for handle the exceptions
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		catch(Exception e)
		{
			System.out.println("Global Exception");

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
 


