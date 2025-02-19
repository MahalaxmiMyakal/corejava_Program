//Write a program using ArrayDeque to add book names and add, delete the values from both ends of queue.

package Anudip_D0453;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		
		//Creating an object of arraydeque to store book names
		ArrayDeque<String> ad = new ArrayDeque<>();

		//Adding book names from both ends
		ad.addFirst("Bhagavad Gita");
		ad.addLast("Mahabharata");
		ad.addFirst("The man and his Philosophy");
		ad.addLast("All lies and says");
		System.out.println("Books in the queue: " +ad);

		//Removing book names from both ends
		ad.removeFirst();
		ad.removeLast();
		System.out.println("Removed Books from the queue : " +ad);
	}
}



/*
Books in the queue: [The man and his Philosophy, Bhagavad Gita, Mahabharata, All lies and says]
Removed from front: [Bhagavad Gita, Mahabharata]
*/