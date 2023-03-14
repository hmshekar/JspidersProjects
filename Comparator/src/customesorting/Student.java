package customesorting;

public class Student {
	int age;
	Student(int age){
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age is "+age;
	}
}
/**
 * Rules->Comparator->Interface->java.util->jdk1.2
 * 1.Create a new class which implements comparator interface & import from java.util package
 * 2.specify Genrics
 * 3. @Override compare()
 * 					syntax: public int compare(){};
 * 4.Create an object of sort logic class and pass the reference to TreeSet()
 * */