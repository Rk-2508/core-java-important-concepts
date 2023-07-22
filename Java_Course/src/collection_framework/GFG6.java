package collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class GFG6 {
	public static void main(String[] args) {
		//Creating Hashset and adding elements
		HashSet<String> hs = new HashSet<String>();
		hs.add("GEEKS");
		hs.add("FOR");
		hs.add("GEEKS");
		hs.add("IS");
		hs.add("VERY IMPORTANT");
		
		//Traversing elements
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
