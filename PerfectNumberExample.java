package Anudip_D0453;

import java.util.Scanner;

public class PerfectNumberExample {
	
	void perfectNumber(int num)//Created  a method called perfectNumber
	{
		int sum=0;   //Declaring the variables
		int div=1;
		
		while(div<num) //Conditions for checking whether is it perfect number or not
		{
			if(num%div==0) 
			{
				sum=sum+div;
			}
			div++;
		}
		if(sum==num) //Printing the result
		{
			System.out.println(+num +" is a perfect number.");
		}
		else 
		{
			System.out.println(+num +" is not a perfect number.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Perfect Number or Not");//Printing Statements
		System.out.println("----------------------");
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);//Taking input form user
		int num=sc.nextInt();
		
		PerfectNumberExample p=new PerfectNumberExample();//Created a object
		p.perfectNumber(num);//Calling the method

	}

}




/*
Perfect Number or Not
----------------------
Enter Number : 
28
28 is a perfect number.
*/