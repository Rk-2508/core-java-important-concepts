//Stack
package collection_framework;

import java.util.Iterator;
import java.util.Stack;

public class GFG3 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("GEEKS");
		stack.push("FOR");
		stack.push("GEEKS");
		stack.push("GEEKS");
		
		//Iterator for the stack
		Iterator<String> itr = stack.iterator();
		
		//Printing the stack
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		System.out.println();
		stack.pop();
		
		//Iterator for the stack
		itr = stack.iterator();
		
		//Printing the stack
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
	}
}
