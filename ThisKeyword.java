//Write java program to invoke current class method using this keyword.

package Anudip_D0453;

public class ThisKeyword {
	void displayMessage() //Method 1
	{
		System.out.println("This is a method invoked using the this keyword");
	}
	
	void callmethod()//Method 2
	{
		this.displayMessage();//Calling method using this keyword
	}

	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword();//object creation
		t.callmethod();//Calling method
	}
}



/*
This is a method invoked using the this keyword
*/