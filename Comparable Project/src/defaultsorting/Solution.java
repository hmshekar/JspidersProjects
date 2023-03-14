package defaultsorting;
import java.util.*;
public class Solution {
	public static void main(String[] args) {

		/** Rules of TreeSet(Implementation)
 1. When you add an object into TreeSet internally compareTo() will get called
 2. return type of compareTO is int , +1 >
 									  -1 <
 									   0 ==
 3. Underlined DataStructure of TreeSet is -> Binary Tree
 4. Traversing order of treeSet is [leftNade, parentNode, rightNode].
 5. compareTo() is present in all the wrapper Classes & String class
 6. if you add Integer Object , compareTo() of Integer gets called
    likewise if you add String object ->compareTo()-> String Class gets called;
		 */
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(20);//Treeset sorts and deletes the duplicate data;
		tree.add(30);
		tree.add(20);
		tree.add(10);
		for(int i: tree) {
			System.out.println(i);
		}
		TreeSet<String> t=new TreeSet<String>();
		t.add("ACA");
		t.add("ABX");
		t.add("Chinna");
		t.add("Anna");
		for(String i: t) {
			System.out.println(i);
		}

		String x="A";
		String y="B";
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(y));
		System.out.println(y.compareTo(x));
		System.out.println("----------------");
		Integer x1=10;
		Integer y1=20;
		System.out.println(x1.compareTo(y1));
		System.out.println(y1.compareTo(x1));
		System.out.println(x1.compareTo(x1));
		System.out.println("----------------");
		Double x2=1.5;
		Double y2=2.5;
		System.out.println(x2.compareTo(y2));
		System.out.println(y2.compareTo(x2));
		System.out.println(x2.compareTo(x2));
		System.out.println("----------------");
	
	
	}
}

