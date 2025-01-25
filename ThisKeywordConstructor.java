//Write a java program to pass this keyword as argument in the constructor call.

package Anudip_D0453;

class A//Created a class
{
	B obj;
	
	A()//Created a constructor
	{
		obj=new B(this);//passing this as an argument to the constructor of class B
	}
	
	void display()//Created a method
	{
		System.out.println("This is a method in class A");
	}
}

class B//Created a class
{
	A a;
	
	B(A a)//Created a constructor
	{
		this.a=a;
	}
	
	void calldisplay()//Created a method
	{
		a.display();
	}
}

public class ThisKeywordConstructor {

	public static void main(String[] args) {
		A objA=new A();//Object creation
		objA.obj.calldisplay();//Calling the method in class B to invoke class A method
	}
}




/*
This is a method in class A
*/