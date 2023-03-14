package Inheretance;

class Student{
	private int age;
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}


public class BeanClass {
public static void main(String[] args) {
	Student s=new Student();
	s.setAge(100);//Initializing age
	s.setName("Shekar");//initializing name
	int age=s.getAge();//Storing in an variable
	System.out.println("Age:"+age);//
	System.out.println("Name:"+s.getName());//Directly printing 
}
}
