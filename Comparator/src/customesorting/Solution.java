package customesorting;

import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
		SortStudentByAge age=new SortStudentByAge();
		TreeSet<Student> t=new TreeSet<Student>(age);// treeSet<Student> t=new TreeSet<Studemt>(new SortStudentByAge());
		t.add(new Student(20));
		t.add(new Student(24));
		t.add(new Student(18));
		for(Student i:t) {
			System.out.println(i);
		}
	}
}
