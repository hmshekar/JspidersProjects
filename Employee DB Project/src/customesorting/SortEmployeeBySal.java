package customesorting;

import java.util.Comparator;
import edbms.Employee;
public class SortEmployeeBySal implements Comparator<Employee> {
	@Override 
	public int compare(Employee e1,Employee e2) {
		Double x=e1.getSal();
		Double y=e2.getSal();
		return x.compareTo(y);
	}

}
