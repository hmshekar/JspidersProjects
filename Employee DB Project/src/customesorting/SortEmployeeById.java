package customesorting;
import java.util.Comparator;
import edbms.Employee;
public class SortEmployeeById implements Comparator<Employee>{
 @Override
 public int compare(Employee e1,Employee e2) {
	 String x=e1.getEid();//e1->Object to be inserted ,e2->Already existing Object
	 String y=e2.getEid();
	 return x.compareTo(y);
//	 return e1.getEid().compareTo(e2.getEid());
 }
}
