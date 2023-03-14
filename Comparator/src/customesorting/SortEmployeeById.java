package customesorting;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee>{
	@Override
	public int compare(Employee x,Employee y) {
		return x.id-y.id;//y.id-x.id
	}
}
//x->object to be inserted, y-> Already existing Object
