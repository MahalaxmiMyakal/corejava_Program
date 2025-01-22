//Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits  from Person and has an additional attribute called "grade" and a method called "study". Create an object of the Student class and  call both the "speak" and "study" methods.

package Anudip_D0453;

class Person{
	
	void speak(String name,int age) {
		System.out.println("Name of the student : "+name);
		System.out.println("Age of the student : "+age);
	}
	
}

public class Student extends Person {

	void study(char grade) {
		System.out.println("Grade of the student : "+grade);
	}
	

	public static void main(String[] args) {
		Student s=new Student();
		s.speak("Shruti",22);
		s.study('A');

	}

}
