package edbms;

public class Employee {
	private String ename;
	private String eid;
	private int age;
	private double sal;
	 static int count=101;
	public Employee(int age,String ename,double sal) {
		this.ename=ename;
		this.age=age;
		this.sal=sal;
		this.eid="EMP"+count;
		count++;
	}
	@Override 
	public String toString() {
		return "Name:"+ename+",Age:"+age+",eid:"+eid+",Sal:"+sal;
	}
	//Getter & Setter
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
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
