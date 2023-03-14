package customesorting;

import java.util.Comparator;
import edbms.Employee;
public class SortEmployeeByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		String x=e1.getEname();
		String y=e2.getEname();
		return x.compareTo(y);
//		return e1.getEname().compareTo(e2.getEname());
	}
}
