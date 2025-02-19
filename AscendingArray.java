////Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]

package Anudip_D0453;

import java.util.Arrays;

public class AscendingArray {

	public static void main(String[] args) {
		int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};//Array creation

        Arrays.sort(numbers);//Sorting array in ascending array
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(numbers));//Printing the result
	}
}



/*
Sorted Array in Ascending Order: [12, 20, 35, 45, 56, 67, 78, 78, 89]
*/