package customesorting;
import java.util.Comparator;
public class SortEmployeeBySal implements Comparator<Employee>{
	@Override
	public int compare(Employee x,Employee y) {
		return x.sal.compareTo(y.sal);//y.sal.compareTo(x.sal);
	}
}
//x -> object to be inserted and y ->Already existing object
//To compare Double objects ,using compareTo() of Double class->line 6;