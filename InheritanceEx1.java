//Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods.

package Anudip_D0453;

class Vehicle //Created a class
{
	String brand="Mercedes SL";
	String model="Roadster";
	int year=2025;
	void drive() //Created a method
	{
		System.out.println("Brand of car : "+brand);//Printing the results
		System.out.println("Model of car : "+model);
		System.out.println("Year of car : "+year);
	}
}

class Car extends Vehicle
{
	String color="red";
	void honk()
	{
		System.out.println("Color of car : "+color);
	}
	
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		Car c=new Car();//Created a object
		c.drive();//calling method
		c.honk();
	}
}



/*
Brand of car : Mercedes SL
Model of car : Roadster
Year of car : 2025
Color of car : red
 */






	
