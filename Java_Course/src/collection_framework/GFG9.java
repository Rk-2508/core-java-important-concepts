//Hashmap
package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GFG9 {
	public static void main(String[] args) {
		
		//Creating hashmap and adding elements
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "GEEKS");
		hm.put(2, "FOR");
		hm.put(3, "GEEKS");
		
		//Finding the value for a key
		System.out.println("value for 1 is "+hm.get(1));
		
		//Traversing through the hashmap
		for(Entry<Integer, String> e: hm.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
	}
}
