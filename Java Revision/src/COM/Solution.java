package COM;
class Student{
	int age;
	String name;
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override	//Object obj=new Student(20,"Tom");
	public boolean equals(Object obj) {  //1->Upcasting
		Student s=(Student)obj;//     2->DownCasting ->
		return this.age==s.age && this.name.equals(s.name); //  3-> Comparison Logic
	}
}
public class Solution {
	public static void main(String[] args) {
		Student s1=new Student(21, "Shekar");
		Student s2=new Student(21, "Shekar");
		System.out.println(s1.equals(s2));
	}
}

// s1 ->this        s2-> obj
//Rules to Override Equals
