package customesorting;

public class Employee {
	int id;
	String name;
	Double sal; //Wrapper class Declaration
	Employee(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "ID:"+id+",  Name:"+name+",  Salary:"+sal;
	}
}
