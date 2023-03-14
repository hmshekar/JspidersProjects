package customesorting;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>{
	@Override
	public int compare(Student x,Student y) {
		return x.age-y.age;
	}
// x-> object to be inserted and y-> already existing object
}
