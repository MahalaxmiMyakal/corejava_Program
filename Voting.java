//Write java program to check  candidate eligible for voting or not

package Anudip_D0453;

import java.util.*;

public class Voting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Voting System....");
		
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("The person is eligible for vote");
		}
		else {
			System.out.println("The person is not eligible for vote");
		}

	}

}


/*
Voting System....
Enter your age : 
21
The person is eligible for vote
*/