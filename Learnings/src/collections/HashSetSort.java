package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetSort {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("SPRING");
		h.add("HIBERNATE");
		h.add("JAVA");
		h.add("AMBI");
		ArrayList <String> a=new ArrayList<String>(h);
		System.out.println(h);
		System.out.println(a);
		System.out.println(a.get(2));
		for(String s:h) {
			System.out.println(s.hashCode());
		}
	}
}
