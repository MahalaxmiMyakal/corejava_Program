// Write a java program for  Unboxing.(all types).

package Anudip_D0453;

public class UnboxingEx {

	public static void main(String[] args) {
		//Converting wrapper classes into a primitive types
		
		byte byteValue = 10;
		Byte obj1 = Byte.valueOf(byteValue);//explicit conversion
	    System.out.println("Byte Value : " +obj1);
		
		short shortValue = 20;
        Short obj2 = Short.valueOf(shortValue);
        System.out.println("Short Value : " +obj2);

        int intValue = 30;
        Integer obj3 = Integer.valueOf(intValue);
        System.out.println("Integer Value : " +obj3);
        
        long longValue = 40L;
        Long obj4 = Long.valueOf(longValue);
        System.out.println("Long Value : " +obj4);
        
        float floatValue = 50.5f;
        Float obj5 = Float.valueOf(floatValue);
        System.out.println("Float Value : " +obj5);
        
        double doubleValue = 60.6;
        Double obj6 = Double.valueOf(doubleValue);
        System.out.println("Double Value : " +obj6);
       
        char charValue = 'A';
        Character obj7 = Character.valueOf(charValue);
        System.out.println("Character Value : " +obj7);
	}
}




/*
Byte Value: 10
Short Value: 20
Integer Value: 30
Long Value: 40
Float Value: 50.5
Double Value: 60.6
Character Value: A
*/