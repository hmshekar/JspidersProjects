package customesorting;
import java.util.Comparator;
public class SortEmployeeByName implements Comparator<Employee>{
	@Override
	public int compare(Employee x,Employee y) {
		return x.name.compareTo(y.name);//y.name.compareTo(x.name);
	}
}
// x-> object to be inserted and y-> already existing object
//to compare String objects we are using 
//compareTo() of String class -> line 6;