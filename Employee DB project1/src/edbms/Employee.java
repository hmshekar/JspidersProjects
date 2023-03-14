package edbms;

public class Employee {
	private String id;
	private String name;
	private int age;
	private double sal;
	private static int count=101;
	public Employee(String name,int age,double sal) {
		this.name=name;
		this.age=age;
		this.sal=sal;
		this.id="EMP"+count;
		count++;
	}
	@Override
	public String toString() {
		return "ID: "+id+"  ,Name:"+name+"  ,Age:"+age+"  ,Sal:"+sal;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	
}
