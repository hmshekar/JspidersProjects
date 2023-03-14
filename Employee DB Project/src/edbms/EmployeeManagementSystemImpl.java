package edbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import customeexception.EmployeeNotFoundException;
import customeexception.InvalidChoiceException;
import customesorting.SortEmployeeByAge;
import customesorting.SortEmployeeByName;
import customesorting.SortEmployeeBySal;
public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
	Scanner scan=new Scanner(System.in);
	Map<String,Employee> db=new TreeMap<String,Employee>();
	@Override
	public void addEmployee() {
		System.out.println("Enter Age");
		int age=scan.nextInt();
		System.out.println("Enter Name");
		String ename=scan.next();
		System.out.println("Enter Salary");
		double sal=scan.nextDouble();
		Employee emp=new Employee(age, ename, sal);
		db.put(emp.getEid(),emp);
		System.out.println("Employee data stored for Eid:"+emp.getEid());
	}

	@Override
	public void displayEmployee() {
		System.out.println("Enter Eid:");
		String id=scan.next().toUpperCase();
		if(db.containsKey(id)) {
			Employee emp=db.get(id);
			System.out.println("Ename:"+emp.getEname());
			System.out.println("Eid:"+emp.getEid());
			System.out.println("Age:"+emp.getAge());
			System.out.println("Salary:"+emp.getSal());
			System.out.println(emp);
		}
		else {
			try {
				String msg="No records present for Eid:"+id;
				throw new EmployeeNotFoundException(msg);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void displayAllEmployee() {
		System.out.println("Displaying all records");
		Set<String> keys=db.keySet();
		for(String key:keys) {
			System.out.println(db.get(key));
		}
	}

	@Override
	public void removeEmployee() {
		System.out.println("Enter Employee Id:");
		String id=scan.nextLine();
		if(db.containsKey(id)) {
			System.out.println(db.get(id));
			db.remove(id);
			System.out.println("Removed the record");
		}
		else {
			try {
				throw new EmployeeNotFoundException("No record with Eid"+id);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeAllEmployee() {
		System.out.println("Removing all records");
		db.clear();
		System.out.println("Removed all Records");
	}

	@Override
	public void updateEmployee() {
		System.out.println("Enter Eid:");
		String id=scan.next();
		if(db.containsKey(id)) {
			System.out.println("1.UpdateName\n2.UpdateAge\n3.UpdateSalary\n4.Exit");
			System.out.println("Enter Choice");
			int choice=scan.nextInt();
			Employee emp=db.get(id);
			switch(choice) {
			case 1:
				System.out.println("Enter Name");
				emp.setEname(scan.nextLine());
			case 2:
				System.out.println("Enter Age");
				emp.setAge(scan.nextInt());
			case 3:
				System.out.println("Enter Salary");
				emp.setSal(scan.nextDouble());
			case 4:
				System.out.println("Thank you");
				System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid choice ,try Again");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("Record not Found for id"+id);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void countEmployee() {
		System.out.println("Records Present in Map Are:"+db.size());
	}

	@Override
	public void sortEmployee() {
		if(db.size()>1) {
			List<Employee>list=new ArrayList<Employee>();
			Set<String >keys=db.keySet();
			for(String key: keys) {
				list.add(db.get(key));
			}
			System.out.println("1.SortByname\n2.SortByAge\n3.SortBySal\n4.Exit");
			System.out.println("Enter Choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(list,new SortEmployeeByName());
				display(list);
			case 2:
				Collections.sort(list,new SortEmployeeByAge());
				display(list);
			case 3:
				Collections.sort(list,new SortEmployeeBySal());
				display(list);
			case 4:
				System.out.println("Thank you");
				System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice,Try Again");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("No records present TO update,Add employee First");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	private void display(List<Employee> list) {
		for(Employee e:list) {
			System.out.println(e);
		}
	}

	@Override
	public void getEmployeeWithHigestSalary() {
		if(db.size()>1) {
			List<Employee>list=new ArrayList<Employee>();
			Set<String >keys=db.keySet();
			for(String key: keys) {
				list.add(db.get(key));
			}
			Collections.sort(list,new SortEmployeeBySal());
			System.out.println(list.get(list.size()-1));
		}
		else {
			try {
				throw new EmployeeNotFoundException("No records present TO update,Add employee First");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void getEmployeeWithlowestSalary() {
		if(db.size()>1) {
			List<Employee>list=new ArrayList<Employee>();
			Set<String >keys=db.keySet();
			for(String key: keys) {
				list.add(db.get(key));
			}
			Collections.sort(list,new SortEmployeeBySal());
			System.out.println(list.get(0));
		}
		else {
			try {
				throw new EmployeeNotFoundException("No records present TO update,Add employee First");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}

//public static void main(String[] args) {
//	EmployeeManagementSystemImpl empi=new EmployeeManagementSystemImpl();
//	empi.addEmployee();
//	empi.displayEmployee();
//	Set<String> keys=db.keySet();
//	System.out.println("Enter Eid:");
////		scan.nextLine();
//	String id=scan.nextLine().toUpperCase();
//	if(db.containsKey(id)) {
//		Employee emp=db.get(id);
//		System.out.println("Ename:"+emp.getEname());
//		System.out.println("Eid:"+emp.getEid());
//		System.out.println("Age:"+emp.getAge());
//		System.out.println("Salary:"+emp.getSal());
//		System.out.println(emp);
//	}
//	
//}