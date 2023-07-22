//Treeset
package collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

public class GFG8 {
	public static void main(String[] args) {
		
		//Creating tree set and adding elements
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("GEEKS");
		ts.add("FOR");
		ts.add("GEEKS");
		ts.add("IS");
		ts.add("VERY HELPFUL");
		
		//Traversing elements
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
