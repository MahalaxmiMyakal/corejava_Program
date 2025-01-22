package Anudip_D0453;

import java.util.Scanner;

public class PrimeNumberExample {
	
	PrimeNumberExample(int num) //Created a constructor name same as classname that is PrimeNumberExample
	{
		boolean prime=true;//Check if the number is prime
		
		if(num<=1) //Condition for number is Less than or equal to 1 are not prime numbers
		{
			prime=false;
		}
		else 
		{
			for(int i=2;i<=num/2;i++) //Check whether number is divisible or not
			{
				if(num%i==0) 
				{
					prime=false;
					break;
				}
			}
		}

		if(prime) //Printing the result
		{
			System.out.println(num +" is a prime number.");
		}
		else 
		{
			System.out.println(num +" is not a prime number.");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Prime Number or Not");//Printing the statement
		System.out.println("--------------------");
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);//Taking input form user
		int num=sc.nextInt();
		
		PrimeNumberExample p=new PrimeNumberExample(num);//Created a object 
	}

}




/*
Prime Number or Not
--------------------
Enter Number : 
3
3 is a prime number.
*/