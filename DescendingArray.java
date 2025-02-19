//Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]

package Anudip_D0453;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {
        String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};//Declaring array

        Arrays.sort(letters);//Sorting array

        for (int i = 0; i < letters.length / 2; i++)//Sorting array in reverse 
        {
            String temp = letters[i];
            letters[i] = letters[letters.length - 1 - i];
            letters[letters.length - 1 - i] = temp;
        }
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(letters));//Printing result
    }
}



/*
Sorted Array in Descending Order: [Z, Y, X, W, D, C, B, A]
 */