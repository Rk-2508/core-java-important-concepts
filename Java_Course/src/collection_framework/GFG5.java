//ArrayDeque
package collection_framework;

import java.util.ArrayDeque;

public class GFG5 {
	public static void main(String[] args) {
		// Initializing an deque
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>(10);
		
		//add method to insert
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		System.out.println(deque);
		
		//clear method 
		deque.clear();
		
		//add first() method to insert the element at the head
		deque.addFirst(564);
		deque.addFirst(291);
		
		//add Last() method to insert the element at the tail
		deque.addLast(24);
		deque.addLast(14);
		System.out.println(deque);
	}
}
