//LinkedHashset
package collection_framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class GFG7 {
	public static void main(String[] args) {
		//Creating LinkedHashset and adding elements
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		LHS.add("GEEKS");
		LHS.add("FOR");
		LHS.add("GEEKS");
		LHS.add("IS");
		LHS.add("VERY HELPFUL");
		
		//Traversing elements
		Iterator<String> itr = LHS.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
