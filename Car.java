//Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child classcalled "Car" that inherits from Vehicle and hasan additional attribute called "color" anda method called "honk".Create an object of the Car class and call both the "drive" and "honk" methods.



package Anudip_D0453;

class Vehicle{
	String brand="Mercedes SL";
	String model="Roadster";
	int year=2025;
	void drive() {
		System.out.println("Brand of car : "+brand);
		System.out.println("Model of car : "+model);
		System.out.println("Year of car : "+year);
	}
}

public class Car extends Vehicle {
	String color="red";
	void honk() {
		System.out.println("Color of car : "+color);
	}
	

	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		c.honk();

	}

}
