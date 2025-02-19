/*Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
Subclasses extend the superclass and override its location() and famousFor() method. 
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. 
As it refers to the base class object and the base class method overrides the superclass method;
the base class method is invoked at runtime. ii.call the location() and famousFor() method 
by the all subclass’,and print accordingly.
*/

package Anudip_D0453;

class HillStations{
	void location() {
		System.out.println("Location of the hill stations.");
	}
	
	void famousfor() {
		System.out.println("what the hill station is famous for.");
	}
}

class Manali extends HillStations{

	@Override
	void location() {
		System.out.println("Manali is located in Himachal Pradesh.")
	}

	@Override
	void famousfor() {
		System.out.println("Manali is famous for its snow-capped mountains and adventure sports.");
	}
}

class Mussoorie extends HillStations{

	@Override
	void location() {
		System.out.println("Mussoorie is located in Uttarakhand.");
	}

	@Override
	void famousfor() {
		System.out.println("Mussoorie is famous for its scenic beauty and colonial charm.");
	}
}

class Gulmarg extends HillStations{

	@Override
	void location() {
		System.out.println("Gulmarg is located in Jammu and Kashmir.");
	}

	@Override
	void famousfor() {
		System.out.println("Gulmarg is famous for its skiing and cable car rides.");
	}	
}

public class HillStaion {

	public static void main(String[] args) {
		
		Manali m1=new Manali();
		m1.location();
		m1.famousfor();
		
		Mussoorie m2=new Mussoorie();
		m2.location();
		m2.famousfor();
		
		Gulmarg m3=new Gulmarg();
		m3.location();
		m3.famousfor();
	}
}




/*
Manali is located in Himachal Pradesh.
Manali is famous for its snow-capped mountains and adventure sports.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for its scenic beauty and colonial charm.
Gulmarg is located in Jammu and Kashmir.
*/
