/*1.Create abstract class vaccine.Create two variables age(int),nationality(String).
create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the 
first dose if the user is Indian and age is 18. After vaccination the user has to 
pay 250rs(which will be displayed on the console). 
Scenario 2: Users are eligible to take the second dose only after completing the first dose. 
Scenario 3: create abstract method boosterDose() in abstract class Vaccine.
Create one implementation class vaccinationSuccessful, where implement boosterDose() method.
Create main class vaccination and invoke all methods accordingly.
[Hint:Create constructor to initialize variables age and nationality,
 Use flow control(Ifelse) to check condition]
*/

package Anudip_D0453;

import java.util.Scanner;

abstract class vaccine//Created a abstract class
{
	
	int age=12;
	String nationality;
	
	vaccine(int age,String nationality)//Created a constructor to initialize variables
	{
		this.age=age;
		this.nationality=nationality;
	}
	
	
	void firstDose() //Concrete method for first dose
	{
		if(age>=18 && nationality.equalsIgnoreCase("India")) //Condition
		{
			System.out.println("First dose taken successfully! Please pay 250 Rs.");		
		}
		else if(age<18)
		{
			System.out.println("You are not eligible for the first dose because your age is less than 18");
		}
		else if(!nationality.equalsIgnoreCase("India")) {
			System.out.println("Yor are not eligible for the first dose because only indian nationals are allowed.");
		}
	}
	
	void secondDose(boolean isFirstDoseCompleted)//Concrete method for second dose
	{
		if(isFirstDoseCompleted) //condition
		{
			System.out.println("Second dose taken successfully!");
		}
		else 
		{
			System.out.println("Sorry! You need to complete the first dose before taking the second dose");
		}
	}
	
	 abstract void boosterDose();//Abstract method for booster dose
}

class VaccinationSuccessful extends vaccine//Created a class
{
	VaccinationSuccessful(int age,String nationality)//
	{
		super(age,nationality);
	}

	@Override
	void boosterDose() 
	{
		System.out.println("Booster dose taken successfully!");
	}
}

public class Vaccination{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Taking input from user
		
		System.out.println("Enter age : ");//Printing statement
		int age=sc.nextInt();
		
		System.out.println("Enter nationality : ");
		String nationality=sc.next();
		
		VaccinationSuccessful vc=new VaccinationSuccessful(age,nationality);//Object creation
		vc.firstDose();//first dose
		
		if(age>=18 && nationality.equalsIgnoreCase("India")) 
		{
		System.out.println("Have you completed your first dose : ");//asking if the completed the first dose
		String firstDoseCompleted=sc.next();
		boolean isFirstDoseCompleted=firstDoseCompleted.equalsIgnoreCase("Yes");
		vc.secondDose(isFirstDoseCompleted);//second dose
		vc.boosterDose();//booster dose
		}
	}
}



/*
Enter age : 
22
Enter nationality : 
India
First dose taken successfully! Please pay 250 Rs.
Have you completed your first dose : 
Yes
Second dose taken successfully!
Booster dose taken successfully!
*/
