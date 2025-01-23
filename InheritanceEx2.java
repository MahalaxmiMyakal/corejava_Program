//Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits  from Person and has an additional attribute called "grade" and a method called "study". Create an object of the Student class and  call both the "speak" and "study" methods.

package Anudip_D0453;

class Person //Created a class
{
	void speak(String name,int age) //Created a method
	{
		System.out.println("Name of the student : "+name);//Printing the results
		System.out.println("Age of the student : "+age);
	}
	
}

class Student extends Person
{
	void study(char grade) 
	{
		System.out.println("Grade of the student : "+grade);
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		Student s=new Student();//Created a object
		s.speak("Shruti",22);//calling method
		s.study('A');
	}
}




/*
Name of the student : Shruti
Age of the student : 22
Grade of the student : A
 */



	


