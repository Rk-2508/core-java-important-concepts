// Priority Queue
package collection_framework;

import java.util.PriorityQueue;

public class GFG4 {
	public static void main(String[] args) {
		//Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		//Adding items to the pqueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		
		
		//Printing the top elements of PriorityQueue
		System.out.println(pQueue.peek());
		
		//Printing the top element and removing it from the PriorityQueue Container
		System.out.println(pQueue.poll());
		
		//Printing the top element again
		System.out.println(pQueue.peek());
	}
}
