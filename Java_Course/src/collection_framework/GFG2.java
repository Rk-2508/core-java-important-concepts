//Vector
package collection_framework;

import java.util.Vector;

public class GFG2 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for(int i=1; i<=5; i++)
		v.add(i);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		for(int i=0; i<v.size(); i++)
		System.out.println(v.get(i)+" ");
	}
}
