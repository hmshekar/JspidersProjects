package edbms;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import customeexception.EmployeeNotFoundException;

public class EmloyeeManagementSystemImpl implements EmployeeManagementSystem{
	Scanner scan=new Scanner(System.in);
	Map<String,Employee> map=new LinkedHashMap<String,Employee>();
	
	@Override
	public void addEmployee() {
		System.out.println("Enter Name");
		String name=scan.nextLine();
		System.out.println("Enter Age");
		int age=scan.nextInt();
		System.out.println("Enter Salary");
		double sal=scan.nextDouble();
		Employee emp=new Employee(name, age, sal);
		
		map.put(emp.getId(), emp);
		System.out.println("Employee Records Saved for id: "+emp.getId());
	}

	@Override
	public void displayEmployee() {
		System.out.println("Enter ID:");
		String id=scan.next().toUpperCase();
		System.out.println(map.containsKey(id));
		if(map.containsKey(id)) {
			System.out.println("Storing details in emp");
			Employee emp=map.get(id);
			System.out.println(emp);
			System.out.println(emp);
		}
		else {
			try {
				throw new EmployeeNotFoundException("No data ");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void displayAllEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Displaying all records");
		Set<String> keys=map.keySet();
		System.out.println(keys);
		for(String key:keys) {
			System.out.println("Getting key: "+map.get(keys));
			System.out.println(map.get(key));
		}
		
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void countEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployeeWithHigestSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployeeWithlowestSalary() {
		// TODO Auto-generated method stub
		
	}
	
}
